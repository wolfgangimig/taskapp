package task.app.srv;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import task.app.BClient_Taskapp;
import task.app.BSkeleton_TaskService;
import task.app.CalculationService;
import task.app.TaskInfo;
import byps.BAsyncResultIgnored;
import byps.BContentStream;
import byps.BException;
import byps.BExceptionC;
import byps.RemoteException;

public class TaskServiceImpl extends BSkeleton_TaskService {
	
	private TaskappSession session;
	private String userName;
	private static HashMap<String, ArrayList<TaskInfo>> tasksOfAllUsers = new HashMap<String, ArrayList<TaskInfo>>();
	private static CalculationService calculationService;
	
	public TaskServiceImpl(TaskappSession sess) {
		this.session = sess;
		this.userName = sess.getRemoteUser();
	}
	
	
	@Override
	public void registerCalculationService(CalculationService calc)
			throws RemoteException {
		calculationService = calc;
	}

	@Override
	public CalculationService getCalculationService() throws RemoteException {
		return calculationService;
	}
	
	@Override
	public List<InputStream> getTaskAttachments(int taskId) throws RemoteException {
		
		List<TaskInfo> tasksOfUser = getTasks();
		
		for (TaskInfo t : tasksOfUser) {
			if (t.getId() == taskId) {
				return t.getAttachments();
			}
		}
		
		throw new BException(BExceptionC.INTERNAL, "Task not found");
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
		TaskappSession taskSession = TaskappSession.userSessions.get(task.getUserName());
		if (taskSession != null) {
			BClient_Taskapp bclient = (BClient_Taskapp) taskSession.getClientR();
			bclient.getTaskNotify().receiveTask(cloneTask(task), 
					new BAsyncResultIgnored<Integer>());
		}
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
					ns = ((BContentStream)is).materialize();
					nstreams.add(ns);
				} catch (IOException e) {
					throw new RemoteException("Failed to clone stream.", e);
				}
				
			}
		}
		
		return n;
	}





}
