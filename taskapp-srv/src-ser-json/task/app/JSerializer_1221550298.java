package task.app;

/*
 * Serializer for task.app.BRequest_TaskService_registerCalculationService
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
public class JSerializer_1221550298 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1221550298();
	
	public JSerializer_1221550298() {
		super(1221550298);
	}
	
	public JSerializer_1221550298(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_TaskService_registerCalculationService obj = (BRequest_TaskService_registerCalculationService)obj1;		
		bout.writeObj("calc",obj.calc, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_TaskService_registerCalculationService obj = (BRequest_TaskService_registerCalculationService)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskService_registerCalculationService()));
		
		final BJsonObject js = bin.currentObject;
		obj.calc = (task.app.CalculationService)bin.readObj("calc", false, null);
		
		return obj;
	}
	
}
