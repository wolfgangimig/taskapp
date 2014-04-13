package task.app.client;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.List;

import task.app.BApiDescriptor_Taskapp;
import task.app.BClient_Taskapp;
import task.app.TaskInfo;
import byps.BContentStream;
import byps.BTransportFactory;
import byps.BWire;
import byps.RemoteException;
import byps.http.HTransportFactoryClient;
import byps.http.HWireClient;

public class TaskappMain {
	
	
	public final static void main(String[] args) {
	
		String url = "http://localhost:8080/taskapp-srv/taskapp";
		BClient_Taskapp bclient = createClient(url);
		
		try {
			setCredentials("Fritz", "abc");
			
			bclient.start();
			System.out.println("connected, targetId=" + bclient.getTransport().getTargetId());

			String command = args.length > 0 ? args[0] : "";
			if (command.equals("-add")) {
				addTask(bclient, args);
			}
			else if (command.equals("-list")) {
				listTasks(bclient);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (bclient != null) {
				bclient.done();
			}
		}
	}
	
	private static BClient_Taskapp createClient(String url) {
		
		BWire wire = new HWireClient(url, 0, 120, null) {
			@Override
			public String getServletPathForNegotiationAndAuthentication() {
				return "/taskappauth/auth";
			};
		};
		
		BTransportFactory tfact = new HTransportFactoryClient(BApiDescriptor_Taskapp.instance(), wire, 1);
		BClient_Taskapp bclient = BClient_Taskapp.createClient(tfact);
		return bclient;
	}

	private static void setCredentials(final String userName, final String userPwd) {
	    class MyAuthenticator extends Authenticator {
	        public PasswordAuthentication getPasswordAuthentication () {
	            return new PasswordAuthentication (userName, userPwd.toCharArray());
	        }
	    }
	    Authenticator.setDefault(new MyAuthenticator());
	}
	
	private static void addTask(BClient_Taskapp bclient, String[] args) throws RemoteException {
		TaskInfo t = new TaskInfo();
		t.setId((int)(System.currentTimeMillis() % 1000));
		t.setUserName(args[1]);
		t.setTodo(args[2]);
		t.setDueDate(new java.util.Date(System.currentTimeMillis() + 24*60*60*1000));
		
		HashMap<String,String> properties = new HashMap<String,String>();
		properties.put("INVOICE", "12345");
		properties.put("CUSTOMER", "67890");
		t.setProperties(properties);
		
		try {
			ArrayList<InputStream> attachments = new ArrayList<InputStream>();
			attachments.add(new FileInputStream(".project"));
			attachments.add(new ByteArrayInputStream("Text as stream".getBytes()));
			t.setAttachments(attachments);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		bclient.getTaskService().addTask(t);
	}
	
	private static void listTasks(BClient_Taskapp bclient) throws RemoteException {
		List<TaskInfo> tasks = bclient.getTaskService().getTasks();
		for (TaskInfo t : tasks) {
			System.out.println("id=" + t.getId() + 
					"\tuserName=" + t.getUserName() + 
					"\ttodo=" + t.getTodo() +
					"\tproperties=" + t.getProperties());
			
			try {
				System.out.print("--- attachments: ");
				for (InputStream s : t.getAttachments()) {
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
		}
	}
	
	
	
	

}
