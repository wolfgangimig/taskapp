//
// Serializer for task.app.BResult_5
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_195526335 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_195526335();
		
		public BSerializer_195526335()
			: base(195526335) {}
		
		public BSerializer_195526335(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_5 obj = (BResult_5)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:494
			bbuf.putInt(obj.resultValue);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_5 obj = (BResult_5)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_5()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:449
			obj.resultValue = bbuf.getInt();
			
			return obj;
		}
		
	}
} // namespace
