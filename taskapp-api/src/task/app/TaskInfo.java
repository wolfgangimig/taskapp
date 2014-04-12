package task.app;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class TaskInfo implements Serializable {

	private static final long serialVersionUID = 3264907623228026167L;

	protected int id;
	
	protected String userName;
	
	/**
	 * @since 1.0.0.1
	 */
	protected HashMap<String,String> properties;
	
	protected Date dueDate;

	protected String todo;
	
	/**
	 * @since 1.0.0.1
	 */
	protected List<InputStream> attachments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public HashMap<String, String> getProperties() {
		return properties;
	}

	public void setProperties(HashMap<String, String> properties) {
		this.properties = properties;
	}

	public List<InputStream> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<InputStream> attachments) {
		this.attachments = attachments;
	}
	
	
	
}
