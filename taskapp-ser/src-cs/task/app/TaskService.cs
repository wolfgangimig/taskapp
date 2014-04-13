using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	// checkpoint byps.gen.cs.GenRemoteClass:93
	public interface TaskService : BRemote {
	
		void AddTask(TaskInfo task);
		void AddTask(TaskInfo task, BAsyncResult<Object> asyncResult) ;
		
		IList<TaskInfo> GetTasks();
		void GetTasks(BAsyncResult<IList<TaskInfo>> asyncResult) ;
		
		
	}
}  // end namespace
