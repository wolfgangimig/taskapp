//
// Serializer for task.app.BResult_1218831438
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_2083176447 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_2083176447();
		
		public BSerializer_2083176447()
			: base(2083176447) {}
		
		public BSerializer_2083176447(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_1218831438 obj = (BResult_1218831438)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:494
			bout.writeObj(obj.resultValue, false, task.app.BSerializer_1218831438.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_1218831438 obj = (BResult_1218831438)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1218831438()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:449
			obj.resultValue = (IList<System.IO.Stream>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
