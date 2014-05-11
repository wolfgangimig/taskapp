using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BStub_TaskService : BStub, TaskService, BSerializable {	
		
		public readonly static long serialVersionUID = 216769899L;
		
		public BStub_TaskService(BTransport transport)
			: base(transport) {}			
		
		public virtual void AddTask(TaskInfo task) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			AddTask(task, BAsyncResultHelper.ToDelegate<Object>(asyncResult));
			asyncResult.GetResult();			
		}
		public virtual void AddTask(TaskInfo task, BAsyncResult<Object> asyncResult) {
			BRequest_TaskService_addTask req = new BRequest_TaskService_addTask();			
			req.taskValue = task;
			transport.sendMethod(req, asyncResult);
		}
		
		public virtual IList<TaskInfo> GetTasks() {
			BSyncResult<IList<TaskInfo>> asyncResult = new BSyncResult<IList<TaskInfo>>();			
			GetTasks(BAsyncResultHelper.ToDelegate<IList<TaskInfo>>(asyncResult));
			return asyncResult.GetResult();			
		}
		public virtual void GetTasks(BAsyncResult<IList<TaskInfo>> asyncResult) {
			BRequest_TaskService_getTasks req = new BRequest_TaskService_getTasks();			
			transport.sendMethod(req, asyncResult);
		}
		
		public virtual void RegisterCalculationService(CalculationService calc) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			RegisterCalculationService(calc, BAsyncResultHelper.ToDelegate<Object>(asyncResult));
			asyncResult.GetResult();			
		}
		public virtual void RegisterCalculationService(CalculationService calc, BAsyncResult<Object> asyncResult) {
			BRequest_TaskService_registerCalculationService req = new BRequest_TaskService_registerCalculationService();			
			req.calcValue = calc;
			transport.sendMethod(req, asyncResult);
		}
		
		public virtual CalculationService GetCalculationService() {
			BSyncResult<CalculationService> asyncResult = new BSyncResult<CalculationService>();			
			GetCalculationService(BAsyncResultHelper.ToDelegate<CalculationService>(asyncResult));
			return asyncResult.GetResult();			
		}
		public virtual void GetCalculationService(BAsyncResult<CalculationService> asyncResult) {
			BRequest_TaskService_getCalculationService req = new BRequest_TaskService_getCalculationService();			
			transport.sendMethod(req, asyncResult);
		}
		
		public virtual IList<System.IO.Stream> GetTaskAttachments(int taskId) {
			BSyncResult<IList<System.IO.Stream>> asyncResult = new BSyncResult<IList<System.IO.Stream>>();			
			GetTaskAttachments(taskId, BAsyncResultHelper.ToDelegate<IList<System.IO.Stream>>(asyncResult));
			return asyncResult.GetResult();			
		}
		public virtual void GetTaskAttachments(int taskId, BAsyncResult<IList<System.IO.Stream>> asyncResult) {
			BRequest_TaskService_getTaskAttachments req = new BRequest_TaskService_getTaskAttachments();			
			req.taskIdValue = taskId;
			transport.sendMethod(req, asyncResult);
		}
		
		
	}
}
