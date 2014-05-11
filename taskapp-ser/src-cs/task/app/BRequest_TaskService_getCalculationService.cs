//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public sealed class BRequest_TaskService_getCalculationService : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public override int getRemoteId() { return 216769899; }
		
		public override void execute(BRemote __byps__remote, BAsyncResultIF<Object> __byps__asyncResult) {
			// checkpoint byps.gen.cs.GenApiClass:406
			try {
				TaskService __byps__remoteT = (TaskService)__byps__remote;				
				BAsyncResultSendMethod<CalculationService> __byps__outerResult = new BAsyncResultSendMethod<CalculationService>(__byps__asyncResult, new BResult_1645863102());				
				__byps__remoteT.GetCalculationService(BAsyncResultHelper.ToDelegate(__byps__outerResult));
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
			}
		}		
		
		#endregion
		
		#region Fields
		
		#endregion
		
		
		public static readonly long serialVersionUID = 1708052887L;		
	} // end class
}  // end namespace
