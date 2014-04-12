using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	// checkpoint byps.gen.cs.GenRemoteClass:93
	public interface TaskNotify : BRemote {
	
		int ReceiveTask(TaskInfo task);
		void ReceiveTask(TaskInfo task, BAsyncResult<int> asyncResult) ;
		
		
	}
}  // end namespace
