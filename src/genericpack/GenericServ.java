package genericpack;
import java.io.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServ extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Generic servlet e.g., </h1>");
		out.print("<h2>Hello! there.</h2>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
