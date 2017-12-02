<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login Cliente effettuato</title>
</head>

<body>
<jsp:include page="Header.jsp"/>

	<hr>
	<h3>Login Cliente effettuato</h3>
	<p>
		Benvenuto <h1> <s:property value="username" /> </h1>
	</p>
	<p>Questa pagina è visibile solo se è stato effettuato il login.</p>

	<hr>
	<jsp:include page="Footer.jsp"/>
</body>

</html>tml>