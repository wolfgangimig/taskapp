package task.app;

/*
 * Serializer for task.app.BRequest_TaskNotify_receiveTask
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_484377997 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_484377997();
	
	public BSerializer_484377997() {
		super(484377997);
	}
	
	public BSerializer_484377997(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_TaskNotify_receiveTask obj = (BRequest_TaskNotify_receiveTask)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.task, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_TaskNotify_receiveTask obj = (BRequest_TaskNotify_receiveTask)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskNotify_receiveTask()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.task = (task.app.TaskInfo)bin.readObj(false, null);
		
		return obj;
	}
	
}
