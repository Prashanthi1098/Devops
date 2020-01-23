

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class loginservlet extends HttpServlet
{
	String user,pass;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		    PrintWriter out=response.getWriter();
		    request.getRequestDispatcher("link.html").include(request, response); 
		    user=request.getParameter("userName");
			pass=request.getParameter("password");
			//request.setAttribute("User",user);
			if(user.equals("shanthi")&&pass.equals("shanthi"))
			{
				HttpSession session=request.getSession();
				session.setAttribute("User",user);
				out.println(user+"welcome");
			}
			else
			{
				out.println("Sorry,Invalid Username or Password");
				request.getRequestDispatcher("login.html").include(request, response);
			}
	}

}
