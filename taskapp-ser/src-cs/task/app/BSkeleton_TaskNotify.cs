using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	/// <summary>
	/// This class provides a skeleton implementation of the interface TaskNotify.
	/// </summary>
	/// <remark>
	/// Your interface implementation class has to be derived from this skeleton.
	/// Either provide an asynchronous or a synchronous function in your subclass.
	/// The framework calls only the asynchronous function.
	/// </remark>
	public class BSkeleton_TaskNotify : BSkeleton, TaskNotify {	
		
		public readonly static long serialVersionUID = 265418285L;
		
		public virtual int ReceiveTasks(List<TaskInfo> tasks) {
			throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
		}
		public virtual void ReceiveTasks(List<TaskInfo> tasks, BAsyncResult<int> asyncResult) {
			int __byps__ret = default(int);
			Exception __byps__ex = null;
			try {
				__byps__ret = ReceiveTasks(tasks);
			}
			catch (Exception e) { __byps__ex = e; }
			asyncResult(__byps__ret, __byps__ex);
		}
		
		
	}
}
