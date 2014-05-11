package task.app.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import task.app.BSkeleton_CalculationService;
import byps.BException;
import byps.BExceptionC;
import byps.RemoteException;

public class CalculationServiceImpl extends BSkeleton_CalculationService {

	@Override
	public int computeSimpleChecksum(List<InputStream> streams) throws RemoteException {
		if (streams == null) throw new IllegalArgumentException("Parameter streams must not be null");
		int sum = 0;
		try {
			for (InputStream is : streams) {
				sum = computeChecksum(sum, is);
			}
		}
		catch (IOException e) {
			throw new BException(BExceptionC.IOERROR, "Failed to read attachment.", e);
		}
		return sum;
	}

	private int computeChecksum(int sum, InputStream is) throws IOException {
		try {
			int b = 0;
			while ((b = is.read()) != -1) {
				sum ^= b;
				sum <<= 1;
			}
		}
		finally {
			is.close();
		}
		return sum;
	}
}
