<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="Header.jsp"/>
	<hr>
	<h3>Login Admin effettuato</h3>
	<p>
		Benvenuto <h1> <s:property value="username" /> </h1>
		
	<p>Questa pagina è visibile solo se è stato effettuato il login.</p>
	<hr>
	<jsp:include page="Footer.jsp"/>
	
</body>
</html>