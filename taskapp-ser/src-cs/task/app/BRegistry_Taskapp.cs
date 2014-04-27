using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BRegistry_Taskapp : BRegistry { 
	
		public BRegistry_Taskapp()
			: base(BBinaryModel.MEDIUM) {}
		
		private static BRegisteredSerializer[] serializers = new BRegisteredSerializer[] {
			new BRegisteredSerializer(195526335, "task.app.BSerializer_195526335", task.app.BSerializer_195526335.instance),
			new BRegisteredSerializer(216769899, "task.app.BSerializer_216769899", task.app.BSerializer_216769899.instance),
			new BRegisteredSerializer(265418285, "task.app.BSerializer_265418285", task.app.BSerializer_265418285.instance),
			new BRegisteredSerializer(280075325, "task.app.BSerializer_280075325", task.app.BSerializer_280075325.instance),
			new BRegisteredSerializer(484377997, "task.app.BSerializer_484377997", task.app.BSerializer_484377997.instance),
			new BRegisteredSerializer(1182472339, "task.app.BSerializer_1182472339", task.app.BSerializer_1182472339.instance),
			new BRegisteredSerializer(1218831438, "task.app.BSerializer_1218831438", task.app.BSerializer_1218831438.instance),
			new BRegisteredSerializer(1252554176, "task.app.BSerializer_1252554176", task.app.BSerializer_1252554176.instance),
			new BRegisteredSerializer(1498136965, "task.app.BSerializer_1498136965", task.app.BSerializer_1498136965.instance),
			new BRegisteredSerializer(1660464439, "task.app.BSerializer_1660464439", task.app.BSerializer_1660464439.instance),
			new BRegisteredSerializer(1766349022, "task.app.BSerializer_1766349022", task.app.BSerializer_1766349022.instance),
			new BRegisteredSerializer(2101800006, "task.app.BSerializer_2101800006", task.app.BSerializer_2101800006.instance),
		};
		protected override BRegisteredSerializer[] getSortedSerializers() {
			return serializers;
		}
	}
}
