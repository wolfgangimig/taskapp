using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	// checkpoint byps.gen.cs.GenRemoteClass:93
	public interface TaskNotify : BRemote {
	
		int ReceiveTasks(List<TaskInfo> tasks);
		void ReceiveTasks(List<TaskInfo> tasks, BAsyncResult<int> asyncResult) ;
		
		
	}
}  // end namespace
