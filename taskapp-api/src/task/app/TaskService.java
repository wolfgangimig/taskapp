package task.app;

import java.util.List;

import byps.Remote;
import byps.RemoteException;

public interface TaskService extends Remote {

	void addTask(TaskInfo task) throws RemoteException;
	
	List<TaskInfo> getTasks() throws RemoteException;
	
}
