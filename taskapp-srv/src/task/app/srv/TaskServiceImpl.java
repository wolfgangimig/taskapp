package task.app.srv;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import task.app.BClient_Taskapp;
import task.app.BSkeleton_TaskService;
import task.app.TaskInfo;
import byps.BAsyncResult;
import byps.BContentStream;
import byps.RemoteException;

public class TaskServiceImpl extends BSkeleton_TaskService {
	
	private TaskappSession session;
	private String userName;
	private static HashMap<String, ArrayList<TaskInfo>> tasksOfAllUsers = new HashMap<String, ArrayList<TaskInfo>>();
	
	public TaskServiceImpl(TaskappSession sess) {
		this.session = sess;
		this.userName = sess.getRemoteUser();
	}

	@Override
	public void addTask(TaskInfo task) throws RemoteException {
		
		task = cloneTask(task);
				
		synchronized(tasksOfAllUsers) {
			ArrayList<TaskInfo> tasksOfUser = tasksOfAllUsers.get(task.getUserName());
			if (tasksOfUser == null) {
				tasksOfAllUsers.put(task.getUserName(), tasksOfUser = new ArrayList<TaskInfo>()); 
			}
			tasksOfUser.add(task);
		}
		
		// Notify client 
		BClient_Taskapp bclient = (BClient_Taskapp) session.getClientR();
		bclient.getTaskNotify().receiveTask(cloneTask(task), new BAsyncResult<Integer>() {
			public void setAsyncResult(Integer result, Throwable ex) {
			}
		});
		
	}

	@Override
	public List<TaskInfo> getTasks() throws RemoteException {
		synchronized(tasksOfAllUsers) {
			ArrayList<TaskInfo> tasksOfUser = tasksOfAllUsers.get(userName);
			if (tasksOfUser == null) {
				tasksOfAllUsers.put(this.userName, tasksOfUser = new ArrayList<TaskInfo>()); 
			}
			return cloneTaskList(tasksOfUser);
		}
	}
	
	private List<TaskInfo> cloneTaskList(List<TaskInfo> tasks) throws RemoteException {
		if (tasks == null) return null;
		ArrayList<TaskInfo> ntasks = new ArrayList<TaskInfo>(tasks.size());
		for (TaskInfo t : tasks) {
			ntasks.add(cloneTask(t));
		}
		return ntasks;
	}

	private TaskInfo cloneTask(TaskInfo t) throws RemoteException {
		TaskInfo n = new TaskInfo();
		n.setId(t.getId());
		n.setUserName(t.getUserName());
		n.setDueDate(t.getDueDate());
		n.setTodo(t.getTodo());
		
		List<InputStream> istreams = t.getAttachments();
		if (istreams != null) {
			List<InputStream> nstreams = new ArrayList<InputStream>(istreams.size());
			n.setAttachments(nstreams);
			for (InputStream is : istreams) {
				BContentStream ns;
				try {
					ns = ((BContentStream)is).cloneInputStream();
					ns.setAttachment(true);
					nstreams.add(ns);
				} catch (IOException e) {
					throw new RemoteException("Failed to clone stream.", e);
				}
				
			}
		}
		
		return n;
	}
}
