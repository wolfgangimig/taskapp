package task.app;

/*
 * Serializer for java.util.HashMap<java.lang.String,java.lang.String>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerMap DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1252554176 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_1252554176();
	
	public BSerializer_1252554176() {
		super(1252554176);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final HashMap<java.lang.String,java.lang.String> map = new HashMap<java.lang.String,java.lang.String>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.String key = bbuf.getString();
			java.lang.String value = bbuf.getString();
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		HashMap<java.lang.String,java.lang.String> map = (HashMap<java.lang.String,java.lang.String>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.String,java.lang.String> obj : map.entrySet()) {
			// checkpoint byps.gen.j.PrintContext:332
			bbuf.putString(obj.getKey() != null ? (String)obj.getKey() : "");
			// checkpoint byps.gen.j.PrintContext:332
			bbuf.putString(obj.getValue() != null ? (String)obj.getValue() : "");
		}
	}
	
}