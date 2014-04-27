using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BClient_Taskapp : BClient { 
	
		public static BClient_Taskapp createClient(BTransportFactory transportFactory) {
			return new BClient_Taskapp(transportFactory);
		}
		
		public static BClient_Taskapp createClientR(BTransport transport) {
			return new BClient_Taskapp(transport);
		}
		
		public virtual BClient_Taskapp addRemote(BSkeleton_TaskNotify remoteSkeleton) {
			if (serverR == null) throw new BException(BExceptionC.NO_REVERSE_CONNECTIONS, "No reverse connections.");
			serverR.server.addRemote(265418285, remoteSkeleton);
			return this;
		}
		
		public virtual TaskNotify TaskNotify
		{
			get { return taskNotifyVal; }
		}
		public virtual TaskService TaskService
		{
			get { return taskServiceVal; }
		}
		
		public override BRemote getStub(int remoteId) {
			if (remoteId == 265418285) return taskNotifyVal;
			if (remoteId == 216769899) return taskServiceVal;
			return null;
		}
		
		protected BClient_Taskapp(BTransportFactory transportFactory)
			: base(
				transportFactory.createClientTransport(), 
				transportFactory.createServerR(
					BServer_Taskapp.createServerR(transportFactory.createServerTransport())
				)
			)
		{
			initStubs(transportVal);
		}
		
		protected BClient_Taskapp(BTransport transport) 
			: base(transport, null)
		{
			initStubs(transportVal);
		}
		
		protected TaskNotify taskNotifyVal;
		protected TaskService taskServiceVal;
		
		private void initStubs(BTransport transport) {
			taskNotifyVal = new BStub_TaskNotify(transport);
			taskServiceVal = new BStub_TaskService(transport);
		}
		
	}
}
