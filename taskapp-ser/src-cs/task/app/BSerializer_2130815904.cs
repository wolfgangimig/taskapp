//
// Serializer for task.app.BRequest_TaskNotify_receiveTasks
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_2130815904 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_2130815904();
		
		public BSerializer_2130815904()
			: base(2130815904) {}
		
		public BSerializer_2130815904(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_TaskNotify_receiveTasks obj = (BRequest_TaskNotify_receiveTasks)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:494
			bout.writeObj(obj.tasksValue, false, task.app.BSerializer_475933318.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_TaskNotify_receiveTasks obj = (BRequest_TaskNotify_receiveTasks)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskNotify_receiveTasks()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:449
			obj.tasksValue = (List<task.app.TaskInfo>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
