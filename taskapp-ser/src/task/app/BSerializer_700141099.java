package task.app;

/*
 * Serializer for task.app.BRequest_CalculationService_computeSimpleChecksum
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
public class BSerializer_700141099 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_700141099();
	
	public BSerializer_700141099() {
		super(700141099);
	}
	
	public BSerializer_700141099(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_CalculationService_computeSimpleChecksum obj = (BRequest_CalculationService_computeSimpleChecksum)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.streams, false, task.app.BSerializer_1218831438.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_CalculationService_computeSimpleChecksum obj = (BRequest_CalculationService_computeSimpleChecksum)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_CalculationService_computeSimpleChecksum()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.streams = (java.util.List<java.io.InputStream>)bin.readObj(false, task.app.BSerializer_1218831438.instance);
		
		return obj;
	}
	
}