package task.app;

/*
 * Serializer for task.app.TaskInfo
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=6

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1660464439 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1660464439();
	
	public BSerializer_1660464439() {
		super(1660464439);
	}
	
	public BSerializer_1660464439(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final TaskInfo obj = (TaskInfo)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putDate(obj.dueDate);
		bbuf.putInt(obj.id);
		bbuf.putString(obj.todo);
		bbuf.putString(obj.userName);
		if (version >= 100000000000001L) {
			bout.writeObj(obj.attachments, false, task.app.BSerializer_1218831438.instance);
			bout.writeObj(obj.properties, false, task.app.BSerializer_1252554176.instance);
		}
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final TaskInfo obj = (TaskInfo)(obj1 != null ? obj1 : bin.onObjectCreated(new TaskInfo()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.dueDate = bbuf.getDate();
		obj.id = bbuf.getInt();
		obj.todo = bbuf.getString();
		obj.userName = bbuf.getString();
		if (version >= 100000000000001L) {
			obj.attachments = (java.util.List<java.io.InputStream>)bin.readObj(false, task.app.BSerializer_1218831438.instance);
			obj.properties = (java.util.HashMap<java.lang.String,java.lang.String>)bin.readObj(false, task.app.BSerializer_1252554176.instance);
		}
		
		return obj;
	}
	
}
