using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BStub_CalculationService : BStub, CalculationService, BSerializable {	
		
		public readonly static long serialVersionUID = 1984352081L;
		
		public BStub_CalculationService(BTransport transport)
			: base(transport) {}			
		
		public virtual int ComputeSimpleChecksum(IList<System.IO.Stream> streams) {
			BSyncResult<int> asyncResult = new BSyncResult<int>();			
			ComputeSimpleChecksum(streams, BAsyncResultHelper.ToDelegate<int>(asyncResult));
			return asyncResult.GetResult();			
		}
		public virtual void ComputeSimpleChecksum(IList<System.IO.Stream> streams, BAsyncResult<int> asyncResult) {
			BRequest_CalculationService_computeSimpleChecksum req = new BRequest_CalculationService_computeSimpleChecksum();			
			req.streamsValue = streams;
			transport.sendMethod(req, asyncResult);
		}
		
		
	}
}
