//
// Serializer for task.app.BRequest_TaskService_getCalculationService
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_1708052887 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1708052887();
		
		public BSerializer_1708052887()
			: base(1708052887) {}
		
		public BSerializer_1708052887(int typeId)
			: base(typeId) {}
		
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_TaskService_getCalculationService obj = (BRequest_TaskService_getCalculationService)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskService_getCalculationService()));
			
			BBufferBin bbuf = bin.bbuf;
			
			return obj;
		}
		
	}
} // namespace
