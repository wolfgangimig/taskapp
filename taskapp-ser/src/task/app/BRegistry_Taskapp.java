package task.app;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRegistry DO NOT MODIFY.
 */

import byps.*;

public class BRegistry_Taskapp extends BRegistry { 

	public BRegistry_Taskapp() {
		super(BBinaryModel.MEDIUM);
	}
	
	private static BRegisteredSerializer[] serializers = new BRegisteredSerializer[] {
		new BRegisteredSerializer(216769899, "task.app.BSerializer_216769899"),
		new BRegisteredSerializer(280075325, "task.app.BSerializer_280075325"),
		new BRegisteredSerializer(1182472339, "task.app.BSerializer_1182472339"),
		new BRegisteredSerializer(1498136965, "task.app.BSerializer_1498136965"),
		new BRegisteredSerializer(1660464439, "task.app.BSerializer_1660464439"),
		new BRegisteredSerializer(1766349022, "task.app.BSerializer_1766349022"),
		new BRegisteredSerializer(2101800006, "task.app.BSerializer_2101800006"),
	};
	@Override
	protected BRegisteredSerializer[] getSortedSerializers() {
		return serializers;
	}
}
