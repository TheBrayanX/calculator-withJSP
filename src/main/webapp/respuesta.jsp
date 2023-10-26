<%@page import="calculator.logica.controlador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calcular</title>
</head>
<body>
	<%
		String num1 = request.getParameter("num_a");
		String num2 = request.getParameter("num_b");
		String op = request.getParameter("resultado");
		
		controlador c = new controlador(num1,num2,op);
	%>

<p>El resultado es: <%=c.getResult()%></p>
</body>
</html>