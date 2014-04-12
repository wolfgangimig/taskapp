using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BStub_TaskNotify : BStub, TaskNotify, BSerializable {	
		
		public readonly static long serialVersionUID = 265418285L;
		
		public BStub_TaskNotify(BTransport transport)
			: base(transport) {}			
		
		public virtual int ReceiveTasks(List<TaskInfo> tasks) {
			BSyncResult<int> asyncResult = new BSyncResult<int>();			
			ReceiveTasks(tasks, BAsyncResultHelper.ToDelegate<int>(asyncResult));
			return asyncResult.GetResult();			
		}
		public virtual void ReceiveTasks(List<TaskInfo> tasks, BAsyncResult<int> asyncResult) {
			BRequest_TaskNotify_receiveTasks req = new BRequest_TaskNotify_receiveTasks();			
			req.tasksValue = tasks;
			transport.sendMethod(req, asyncResult);
		}
		
		
	}
}
