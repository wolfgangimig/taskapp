using System;
using System.Collections.Generic;
using byps;

namespace task.app
{
	
	public class BApiDescriptor_Taskapp { 
	
		/**
		 * API serialisation version: 1.0.0.1
		 */
		public const long VERSION = 100000000000001L;
		
		public readonly static BApiDescriptor instance = new BApiDescriptor(
			"Taskapp",
			"task.app",
			VERSION,
			false) // uniqueObjects
			.addRegistry(new BRegistry_Taskapp());
		
		
	}
}
