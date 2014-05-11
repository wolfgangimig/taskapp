package task.app;

import java.io.InputStream;
import java.util.List;

import byps.Remote;
import byps.RemoteException;

/**
 * @since 1.0.0.1
 */
public interface CalculationService extends Remote {

	public int computeSimpleChecksum(List<InputStream> streams) throws RemoteException;

}
