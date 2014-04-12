//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public sealed class BRequest_TaskNotify_receiveTasks : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public override int getRemoteId() { return 265418285; }
		
		public override void execute(BRemote __byps__remote, BAsyncResultIF<Object> __byps__asyncResult) {
			// checkpoint byps.gen.cs.GenApiClass:406
			try {
				TaskNotify __byps__remoteT = (TaskNotify)__byps__remote;				
				BAsyncResultSendMethod<int> __byps__outerResult = new BAsyncResultSendMethod<int>(__byps__asyncResult, new BResult_5());				
				__byps__remoteT.ReceiveTasks(tasksValue, BAsyncResultHelper.ToDelegate(__byps__outerResult));
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(0, e);
			}
		}		
		
		#endregion
		
		#region Fields
		
		internal List<TaskInfo> tasksValue;

		#endregion
		
		
		public static readonly long serialVersionUID = 2130815904L;		
	} // end class
}  // end namespace
