package task.app;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface TaskServiceAsync extends BRemote, 
	TaskService {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public void addTask(TaskInfo task) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void addTask(TaskInfo task, final BAsyncResult<Object> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.List<TaskInfo> getTasks() throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void getTasks(final BAsyncResult<java.util.List<TaskInfo>> asyncResult) ;
	
	
}
