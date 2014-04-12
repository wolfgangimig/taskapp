package task.app;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenClient DO NOT MODIFY.
 */

import byps.*;

public class BClient_Taskapp extends BClient { 

	public static BClient_Taskapp createClient(BTransportFactory transportFactory) {
		return new BClient_Taskapp(transportFactory);
	}
	
	public static BClient_Taskapp createClientR(BTransport transport) {
		return new BClient_Taskapp(transport);
	}
	
	public BClient_Taskapp addRemote(BSkeleton_TaskService remoteSkeleton) throws BException {
		if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
		serverR.server.addRemote(216769899, remoteSkeleton);
		return this;
	}
	
	public TaskServiceAsync getTaskService() {
		return taskService;
	}
	
	@Override
	public BRemote getStub(int remoteId) {
		if (remoteId == 216769899) return taskService;
		return null;
	}
	
	protected BClient_Taskapp(BTransportFactory transportFactory) {
		super(
			transportFactory.createClientTransport(), 
			transportFactory.createServerR(
				BServer_Taskapp.createServerR(transportFactory.createServerTransport())
			)
		);
		initStubs(transport);
	}
	
	protected BClient_Taskapp(BTransport transport) {
		super(transport, null);
		initStubs(transport);
	}
	
	protected TaskServiceAsync taskService;
	
	private void initStubs(BTransport transport) {
		taskService = new BStub_TaskService(transport);
	}
	
}
