﻿//
// Serializer for task.app.BRequest_TaskNotify_receiveTask
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_484377997 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_484377997();
		
		public BSerializer_484377997()
			: base(484377997) {}
		
		public BSerializer_484377997(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_TaskNotify_receiveTask obj = (BRequest_TaskNotify_receiveTask)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:494
			bout.writeObj(obj.taskValue, false, null);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_TaskNotify_receiveTask obj = (BRequest_TaskNotify_receiveTask)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskNotify_receiveTask()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:449
			obj.taskValue = (task.app.TaskInfo)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
