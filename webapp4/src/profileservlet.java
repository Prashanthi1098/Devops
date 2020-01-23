

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class profileservlet extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		    PrintWriter out=response.getWriter();  
		    request.getRequestDispatcher("link.html").include(request, response); 
		    HttpSession session=request.getSession(false);  
	        if(session!=null)
	        {  
	        String user=(String)session.getAttribute("User");  
	          
	        out.println("Hello, "+user+" Welcome to Profile");  
	        }  
	        else
	        {  
	            out.println("Please login first");  
	            request.getRequestDispatcher("login.html").include(request, response);  
	        }  
	}

}
