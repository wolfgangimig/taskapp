package task.app;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiDescriptor DO NOT MODIFY.
 */

import byps.*;

public class BApiDescriptor_Taskapp { 

	/**
	 * API serialisation version: 1.0.0.0
	 */
	public final static long VERSION = 100000000000000L;
	
	public final static BApiDescriptor instance() {
		return new BApiDescriptor(
			"Taskapp",
			"task.app",
			VERSION,
			false) // uniqueObjects
			.addRegistry(new BRegistry_Taskapp());
	}
	
	
}
