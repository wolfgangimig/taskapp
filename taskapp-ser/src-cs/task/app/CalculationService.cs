using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	// checkpoint byps.gen.cs.GenRemoteClass:93
	public interface CalculationService : BRemote {
	
		int ComputeSimpleChecksum(IList<System.IO.Stream> streams);
		void ComputeSimpleChecksum(IList<System.IO.Stream> streams, BAsyncResult<int> asyncResult) ;
		
		
	}
}  // end namespace
