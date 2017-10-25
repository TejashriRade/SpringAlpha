<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#006622">
	<% 
	
	//requesting name and birth date from client page
		
		String ename= request.getParameter("n1");
		String Bdate= request.getParameter("d1");
		
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
	    
		
		out.println(id);
		
	
		%>
	

</body>
</html>