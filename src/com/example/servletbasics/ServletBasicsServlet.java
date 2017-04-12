package com.example.servletbasics;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ServletBasicsServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title> My First Servlet </title>");
		out.println("<body>");
		out.println("<h1> Hello! How are you? </h1>");
		out.println("<h2> I am enjoying this servlet application </h2>");
		out.println("<h3> See you later! </h3>");
		out.println("</body>");
		out.println("</html>");

	}
}
