package task.app.srv;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import task.app.BClient_Taskapp;
import task.app.BSkeleton_TaskService;
import task.app.TaskInfo;
import byps.RemoteException;
import byps.http.HSession;

public class TaskServiceImpl extends BSkeleton_TaskService {
	
	private String userName;
	private static HashMap<String, ArrayList<TaskInfo>> tasksOfAllUsers = new HashMap<String, ArrayList<TaskInfo>>();
	
	private HSession session;
	
	public TaskServiceImpl(HSession session) {
		this.session = session;
		this.userName = "Fritz"; 
	}

	@Override
	public void addTask(TaskInfo task) throws RemoteException {
		
		// Read streams from client and replace them in TaskInfo object
		try {
			List<InputStream> istreams = task.getAttachments();
			if (istreams!= null) {
				
				List<InputStream> nstreams = new ArrayList<InputStream>();
				task.setAttachments(nstreams);
				
				for (InputStream is : istreams) {
					byte[] buf = new byte[100];
					int len = is.read(buf);
					InputStream ns = new ByteArrayInputStream(buf, 0, len);
					nstreams.add(ns);
					is.close();
				}
			}
		}
		catch (IOException e) {
			throw new RemoteException("Failed to read streams", e);
		}
				
		synchronized(tasksOfAllUsers) {
			ArrayList<TaskInfo> tasksOfUser = tasksOfAllUsers.get(task.getUserName());
			if (tasksOfUser == null) {
				tasksOfAllUsers.put(task.getUserName(), tasksOfUser = new ArrayList<TaskInfo>()); 
			}
			tasksOfUser.add(task);
		}
		
		// Notify client 
		BClient_Taskapp bclient = (BClient_Taskapp)session.getClientR();
		bclient.getTaskNotify().receiveTask(task);
		
	}

	@Override
	public List<TaskInfo> getTasks() throws RemoteException {
		synchronized(tasksOfAllUsers) {
			ArrayList<TaskInfo> tasksOfUser = tasksOfAllUsers.get(userName);
			if (tasksOfUser == null) {
				tasksOfAllUsers.put(this.userName, tasksOfUser = new ArrayList<TaskInfo>()); 
			}
			
			// Move stream position to begin
			for (TaskInfo task : tasksOfUser) {
				List<InputStream> streams = task.getAttachments();
				if (streams != null) {
					for (InputStream is : task.getAttachments()) {
						ByteArrayInputStream bs = (ByteArrayInputStream)is;
						bs.reset();
					}
				}
			}
			
			return tasksOfUser;
		}
	}

}
