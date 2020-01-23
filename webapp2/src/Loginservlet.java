

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class Loginservlet extends HttpServlet
{
	 String user,pass;
	public void init()
	{
		System.out.println("Inside init method");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		//out.println("Hello everyone");
	    user=request.getParameter("user");
		pass=request.getParameter("pass");
		request.setAttribute("User",user);
		if(user.equals("shanthi")&&pass.equals("shanthi"))
		{
			response.sendRedirect("Servlet2?User= "+user);
			//RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
			//rd.forward(request,response);
		//out.println("hello "+user+" welcome to this site");
		//out.println("Email "+getServletContext().getInitParameter("Email"));
		}
		else
		{
			response.sendRedirect("project.Html");
				out.println("invalid user");
			//RequestDispatcher rd=request.getRequestDispatcher("Login.Html");
			//out.println("Invalid Username ");
		   // System.out.println("Inside service method");
		}
	}
public void destroy()
{
	System.out.println("Inside destroy method");
}
}
