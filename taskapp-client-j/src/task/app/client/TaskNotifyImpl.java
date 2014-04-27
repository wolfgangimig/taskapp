package task.app.client;

import java.io.IOException;
import java.io.InputStream;

import task.app.BSkeleton_TaskNotify;
import task.app.TaskInfo;
import byps.BContentStream;
import byps.RemoteException;

public class TaskNotifyImpl extends BSkeleton_TaskNotify {

	@Override
	public int receiveTask(TaskInfo task) throws RemoteException {
		System.out.println("received task: " + task);
		
		try {
			System.out.print("--- attachments: ");
			for (InputStream s : task.getAttachments()) {
				BContentStream bs = (BContentStream)s;
				System.out.print("{ " + bs.getContentType() + ", #" + bs.getContentLength() + ", [");
				for (int i = 0; i < 10; i++) {
					System.out.print((char)bs.read());
				}
				System.out.print("]}, ");
			}
			System.out.println();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return 123;
	}
}
