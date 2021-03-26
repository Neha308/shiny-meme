<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	String string = "Hellooo Friends!!!";

%>
<h1><%= string %></h1>
<center>
	<% 
		for(int i=0; i<=6; i++){
			
		
	
	%>
	 	<font size="<%= i %>">Helloooooo</font> <br />
	 <%
		}
	 %>
</center>

</body>
</html>