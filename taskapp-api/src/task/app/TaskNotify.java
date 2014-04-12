package task.app;

import byps.BRemote;
import byps.RemoteException;

/**
 * 
 * @BClientRemote
 */
public interface TaskNotify extends BRemote {

	void receiveTask(TaskInfo task) throws RemoteException;
	
}
