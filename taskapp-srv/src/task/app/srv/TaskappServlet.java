package task.app.srv;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import byps.BApiDescriptor;
import byps.BException;
import byps.BExceptionC;
import byps.BServerRegistry;
import byps.http.HConfig;
import byps.http.HConfigImpl;
import byps.http.HHttpServlet;
import byps.http.HSession;

/**
 * Servlet implementation class TaskappServlet
 */
@WebServlet(

		// mandatory: must be true
		asyncSupported = true,

		// mandatory: server URL patterns
		urlPatterns = { "/taskapp" }
)
public class TaskappServlet extends HHttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final HConfigImpl config = new HConfigImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskappServlet() {
        super();
    }

	@Override
	protected HSession createSession(HttpServletRequest request,
			HttpServletResponse response, HttpSession hsess) throws BException {
	    String remoteUser = request.getRemoteUser();
	    if (remoteUser == null) throw new BException(BExceptionC.FORBIDDEN, "Missing remote user attribute.");
	    return new TaskappSession(hsess, remoteUser, this);
	}

	@Override
	protected BApiDescriptor getApiDescriptor() {
		return TaskappSession.apiDesc;
	}

	@Override
	public HConfig getConfig() {
		return config;
	}


    
    
}

