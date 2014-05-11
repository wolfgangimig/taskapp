//
// Serializer for task.app.BRequest_CalculationService_computeSimpleChecksum
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_700141099 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_700141099();
		
		public BSerializer_700141099()
			: base(700141099) {}
		
		public BSerializer_700141099(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_CalculationService_computeSimpleChecksum obj = (BRequest_CalculationService_computeSimpleChecksum)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:494
			bout.writeObj(obj.streamsValue, false, task.app.BSerializer_1218831438.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_CalculationService_computeSimpleChecksum obj = (BRequest_CalculationService_computeSimpleChecksum)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_CalculationService_computeSimpleChecksum()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:449
			obj.streamsValue = (IList<System.IO.Stream>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
