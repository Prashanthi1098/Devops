

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class servlet1 extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String str1 = request.getParameter("item");
		String str2 = request.getParameter("qty");
		String str3 = request.getParameter("add");
		String str4 = request.getParameter("list");
		PrintWriter out=response.getWriter();  
		if(str3!=null)
		{
			Cookie c1=new Cookie(str1,str2);
			response.addCookie(c1);;
			response.sendRedirect("Home.html");
		}
		else if(str4!=null)
		{
			Cookie clientCookies[]=request.getCookies();
			for(int i=0;i<clientCookies.length;i++)
			{
				out.println("<B>"+clientCookies[i].getName()+":"+clientCookies[i].getValue()+"<B><BR>");
			}
		}
	}

}
