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
		
		void RegisterCalculationService(CalculationService calc);
		void RegisterCalculationService(CalculationService calc, BAsyncResult<Object> asyncResult) ;
		
		CalculationService GetCalculationService();
		void GetCalculationService(BAsyncResult<CalculationService> asyncResult) ;
		
		IList<System.IO.Stream> GetTaskAttachments(int taskId);
		void GetTaskAttachments(int taskId, BAsyncResult<IList<System.IO.Stream>> asyncResult) ;
		
		
	}
}  // end namespace
