package task.app;

import java.util.ArrayList;

import byps.BRemote;
import byps.RemoteException;

/**
 * @BClientRemote
 * @since 1.0.0.1
 */
public interface TaskNotify extends BRemote {

	public int receiveTasks(ArrayList<TaskInfo> tasks) throws RemoteException;
	
}
