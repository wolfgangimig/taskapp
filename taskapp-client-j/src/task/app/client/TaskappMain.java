package task.app.client;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.List;

import task.app.BApiDescriptor_Taskapp;
import task.app.BClient_Taskapp;
import task.app.TaskInfo;
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
		bclient.getTaskService().addTask(t);
	}
	
	private static void listTasks(BClient_Taskapp bclient) throws RemoteException {
		List<TaskInfo> tasks = bclient.getTaskService().getTasks();
		for (TaskInfo t : tasks) {
			System.out.println("id=" + t.getId() + 
					"\tuserName=" + t.getUserName() + 
					"\ttodo=" + t.getTodo());
		}
	}
}
