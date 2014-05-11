package task.app;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteSkeleton DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a skeleton implementation of the interface CalculationService.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_CalculationService extends BSkeleton implements CalculationServiceAsync {
	
	public final static long serialVersionUID = 1984352081L;
	
	// checkpoint byps.gen.j.PrintContext:365
	public int computeSimpleChecksum(java.util.List<java.io.InputStream> streams) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void computeSimpleChecksum(java.util.List<java.io.InputStream> streams, final BAsyncResult<Integer> asyncResult) {
		try {
			int ret = computeSimpleChecksum(streams);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}