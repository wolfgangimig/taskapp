package task.app.client;

import java.util.ArrayList;

import byps.RemoteException;
import task.app.BSkeleton_TaskNotify;
import task.app.TaskInfo;

public class TaskNotifyImpl extends BSkeleton_TaskNotify {

	@Override
	public int receiveTasks(ArrayList<TaskInfo> tasks) throws RemoteException {
		System.out.println("received tasks: " + tasks);
		return 123;
	}
}
