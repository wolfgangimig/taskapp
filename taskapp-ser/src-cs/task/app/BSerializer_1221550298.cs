//
// Serializer for task.app.BRequest_TaskService_registerCalculationService
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_1221550298 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1221550298();
		
		public BSerializer_1221550298()
			: base(1221550298) {}
		
		public BSerializer_1221550298(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_TaskService_registerCalculationService obj = (BRequest_TaskService_registerCalculationService)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:494
			bout.writeObj(obj.calcValue, false, null);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_TaskService_registerCalculationService obj = (BRequest_TaskService_registerCalculationService)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskService_registerCalculationService()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:449
			obj.calcValue = (task.app.CalculationService)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
