package task.app;

import java.io.InputStream;
import java.util.List;

import byps.Remote;
import byps.RemoteException;

public interface TaskService extends Remote {

	void addTask(TaskInfo task) throws RemoteException;
	
	List<TaskInfo> getTasks() throws RemoteException;
	
	/**
	 * @since 1.0.0.1
	 */
	void registerCalculationService(CalculationService calc) throws RemoteException;
	
	/**
	 * @since 1.0.0.1
	 */
	CalculationService getCalculationService() throws RemoteException;
	
	/**
	 * @since 1.0.0.1
	 */
	List<InputStream> getTaskAttachments(int taskId) throws RemoteException;
}
