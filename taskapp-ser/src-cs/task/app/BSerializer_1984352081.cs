//
// Serializer for task.app.BStub_CalculationService
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BSerializer_1984352081 : BSerializer_16 {
		
		public readonly static BSerializer instance = new BSerializer_1984352081();
		
		public BSerializer_1984352081()
			: base(1984352081) {}
		
		protected override BRemote internalCreate(BTransport transport) {
			return new BStub_CalculationService(transport);
		}
		
	}
} // namespace
