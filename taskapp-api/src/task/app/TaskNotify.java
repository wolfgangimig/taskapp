package task.app;

import byps.BRemote;
import byps.RemoteException;

/**
 * @BClientRemote
 * @since 1.0.0.1
 */
public interface TaskNotify extends BRemote {

	public int receiveTask(TaskInfo task) throws RemoteException;
	
}
