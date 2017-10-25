package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name= request.getParameter("name");
		String pwd= request.getParameter("pwd");
		
		if(name.equals("Tejashri27") && pwd.equals("Teju123"))
		{
			//RequestDispatcher rd= request.getRequestDispatcher("WelcomeServ");
			//rd.forward(request, response);
			
			response.sendRedirect("WelcomeServ");
		}
		else	
			response.sendRedirect("Invalid");
		
		
		
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor='cyan'>");
		out.println("</body>");
		out.println("</html>");

		
	}

	
	

}
