package task.app;

/*
 * Serializer for task.app.BRequest_TaskNotify_receiveTasks
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_2130815904 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_2130815904();
	
	public JSerializer_2130815904() {
		super(2130815904);
	}
	
	public JSerializer_2130815904(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_TaskNotify_receiveTasks obj = (BRequest_TaskNotify_receiveTasks)obj1;		
		bout.writeObj("tasks",obj.tasks, false, task.app.JSerializer_475933318.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_TaskNotify_receiveTasks obj = (BRequest_TaskNotify_receiveTasks)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskNotify_receiveTasks()));
		
		final BJsonObject js = bin.currentObject;
		obj.tasks = (java.util.ArrayList<task.app.TaskInfo>)bin.readObj("tasks", false, task.app.JSerializer_475933318.instance);
		
		return obj;
	}
	
}