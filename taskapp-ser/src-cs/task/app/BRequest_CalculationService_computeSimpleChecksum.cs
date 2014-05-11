//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public sealed class BRequest_CalculationService_computeSimpleChecksum : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public override int getRemoteId() { return 1984352081; }
		
		public override void execute(BRemote __byps__remote, BAsyncResultIF<Object> __byps__asyncResult) {
			// checkpoint byps.gen.cs.GenApiClass:406
			try {
				CalculationService __byps__remoteT = (CalculationService)__byps__remote;				
				BAsyncResultSendMethod<int> __byps__outerResult = new BAsyncResultSendMethod<int>(__byps__asyncResult, new BResult_5());				
				__byps__remoteT.ComputeSimpleChecksum(streamsValue, BAsyncResultHelper.ToDelegate(__byps__outerResult));
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(0, e);
			}
		}		
		
		#endregion
		
		#region Fields
		
		internal IList<System.IO.Stream> streamsValue;

		#endregion
		
		
		public static readonly long serialVersionUID = 700141099L;		
	} // end class
}  // end namespace
