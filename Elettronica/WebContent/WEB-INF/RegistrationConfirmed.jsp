<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="title.registrationok" /></title>
</head>
<body>
<s:include value="../WebApp/Header.jsp"></s:include>

	<hr>
	<h3>
		<s:text name="title.registrationok" />
	</h3>
	<div style="background-color: #aaffcc;">
		<s:actionmessage />
	</div>
	<s:if test="#session.cliente != null">
	<div>
		<p>
			<s:text name="text.registrationok">
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

		<p>
			<s:if test="cliente.accettaCondizioni == true">
        Inoltre hai accettato le condizioni per l'iscrizione.
        </s:if>
			<s:else>
        Non hai accettato le condizioni per l'iscrizione.
        </s:else>
		</p>
		<br />
		
		<s:text name="text.thanks" />
	</div>
	</s:if>
	<s:else>
	<div>
		<p>
			<s:text name="text.registrationok">
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

		<p>
			<s:if test="accettaCondizioni == true">
        Inoltre hai accettato le condizioni per l'iscrizione.
        </s:if>
			<s:else>
        Non hai accettato le condizioni per l'iscrizione.
        </s:else>
		</p>
		<br />
		
		<s:text name="text.thanks" />
	</div>
	
	</s:else>
	<hr>
		<s:include value="../WebApp/Footer.jsp"></s:include>
</body>

</html>