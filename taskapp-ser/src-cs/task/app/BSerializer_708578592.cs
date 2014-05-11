//
// Serializer for task.app.BRequest_TaskService_getTaskAttachments
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_708578592 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_708578592();
		
		public BSerializer_708578592()
			: base(708578592) {}
		
		public BSerializer_708578592(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_TaskService_getTaskAttachments obj = (BRequest_TaskService_getTaskAttachments)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:494
			bbuf.putInt(obj.taskIdValue);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_TaskService_getTaskAttachments obj = (BRequest_TaskService_getTaskAttachments)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskService_getTaskAttachments()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:449
			obj.taskIdValue = bbuf.getInt();
			
			return obj;
		}
		
	}
} // namespace
