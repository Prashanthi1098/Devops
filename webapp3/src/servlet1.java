

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class servlet1 extends HttpServlet
{

   String name;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		name=request.getParameter("userName");
		HttpSession session=request.getSession();
		//name=request.getParameter("userName");
		session.setAttribute("User",name);
		out.println("<a href='servlet2'>Click</a>");
	}

}
