<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Admin effettuato</title>
</head>
<body>

<jsp:include page="../../WebApp/Header.jsp"/>
	<hr>
	<h3>Login Admin effettuato</h3>
	<p>
	<s:text name="global.title.login">
          <s:param value="#session.responsabile.username" />
          <s:param value="#session.responsabile.password" />
        </s:text>
	</p>
	<hr>
	<div class="woocommerce-info" style="text-align: center;"><a href="<s:url action='AggiungiResponsabile' namespace='/'/>">NOMINA NUOVO RESPONSABILE</a></div>
	
	<jsp:include page="../../WebApp/Footer.jsp"/>
	
</body>
</html>