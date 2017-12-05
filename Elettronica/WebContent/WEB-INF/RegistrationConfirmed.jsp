<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="global.title.registrationok" /></title>
</head>
<body>
<s:include value="../WebApp/Header.jsp"></s:include>

	<hr>
	<h3>
		<s:text name="global.title.registrationok" />
	</h3>
	
	<s:if test="#session.responsabile != null">
	<div>
		<p>
			<s:text name="global.title.registrationok">
				<s:param value="nome" />
				<s:param value="username" />
				<s:param value="password" />
			</s:text>
		<p>Questa è la tua scheda:</p>

		<ul>
			<li>Cognome: <s:property value="cognome" />
			<li>CodiceF: <s:property value="codiceF" />
			<li>E-mail: <s:property value="email" />
			<li>Data di nascita: <s:property value="dataNascita" />
		</ul>
		<br />
		
		<s:text name="global.text.thanks" />
	</div>
	
	</s:if>
	
	<s:else>
	<div>
		<p>
			<s:text name="global.title.registrationok">
				<s:param value="cliente.nome" />
				<s:param value="cliente.username" />
				<s:param value="cliente.password" />
			</s:text>
		<p>Questa è la tua scheda:</p>

		<ul>
			<li>Cognome: <s:property value="cliente.cognome" />
			<li>CodiceF: <s:property value="cliente.codiceF" />
			<li>E-mail: <s:property value="cliente.email" />
			<li>Data di nascita: <s:property value="cliente.dataNascita" />
		</ul>
		<br />
		
		<s:text name="global.text.thanks" />
	</div>
	</s:else>
	<hr>
		<s:include value="../WebApp/Footer.jsp"></s:include>
</body>

</html>