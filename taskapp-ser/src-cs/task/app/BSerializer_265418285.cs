//
// Serializer for task.app.BStub_TaskNotify
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_265418285 : BSerializer_16 {
		
		public readonly static BSerializer instance = new BSerializer_265418285();
		
		public BSerializer_265418285()
			: base(265418285) {}
		
		protected override BRemote internalCreate(BTransport transport) {
			return new BStub_TaskNotify(transport);
		}
		
	}
} // namespace
