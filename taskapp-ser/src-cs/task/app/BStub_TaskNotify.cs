using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BStub_TaskNotify : BStub, TaskNotify, BSerializable {	
		
		public readonly static long serialVersionUID = 265418285L;
		
		public BStub_TaskNotify(BTransport transport)
			: base(transport) {}			
		
		public virtual int ReceiveTask(TaskInfo task) {
			BSyncResult<int> asyncResult = new BSyncResult<int>();			
			ReceiveTask(task, BAsyncResultHelper.ToDelegate<int>(asyncResult));
			return asyncResult.GetResult();			
		}
		public virtual void ReceiveTask(TaskInfo task, BAsyncResult<int> asyncResult) {
			BRequest_TaskNotify_receiveTask req = new BRequest_TaskNotify_receiveTask();			
			req.taskValue = task;
			transport.sendMethod(req, asyncResult);
		}
		
		
	}
}
