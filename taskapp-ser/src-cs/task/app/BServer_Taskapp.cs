using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BServer_Taskapp : BServer { 
	
		public static BServer_Taskapp createServer(BTransportFactory transportFactory) {
			return new BServer_Taskapp(transportFactory);
		}
		
		public static BServer_Taskapp createServerR(BTransport transport) {
			return new BServer_Taskapp(transport);
		}
		
		public BServer_Taskapp(BTransport transport) 
			: base(transport, null)
		{
		}
		
		public BServer_Taskapp(BTransportFactory transportFactory) 
			: base(
				transportFactory.createServerTransport(),
				transportFactory.createClientR(
					BClient_Taskapp.createClientR(
						transportFactory.createClientTransport()
					)
				)
			)
		{
		}
		
		public BServer_Taskapp addRemote(BSkeleton_TaskNotify remoteSkeleton) {
			addRemote(265418285, remoteSkeleton);
			return this;
		}
		
	}
}
