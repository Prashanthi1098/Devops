

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet 
{
	String name,pass,email,country;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		name=request.getParameter("userName");
		pass=request.getParameter("userPass");
		email=request.getParameter("userEmail");
		country=request.getParameter("userCountry");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/shanthi","root","");
			Statement st=c.createStatement();
			int count=st.executeUpdate("insert into shanthi.register values('"+name+"','"+pass+"','"+email+"','"+country+"')");
					out.println(count+" rows updated");
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}
