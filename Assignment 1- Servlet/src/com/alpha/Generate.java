package com.alpha;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/generate")
public class Generate extends HttpServlet {
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		//requesting name and birth date from client page
		
		String ename= req.getParameter("n1");
		String Bdate= req.getParameter("d1");
		
		char [] charr= ename.toCharArray(); //string converted to char array
		Random random= new Random();	
	    StringBuffer id= new StringBuffer();
	    
	    //generating random string from given string 
	    for (int i=0;i< ename.length();i++)
	    {
	    	char c= charr[random.nextInt(charr.length)];
	    	id.append(c);	
	    }
	   // appending birthdate to string
	    id.append(Bdate.substring(0,2));
	    
		
		
		PrintWriter out= res.getWriter();
		System.out.println(id);

		System.out.println("Servlet is called");
	}
	
}
