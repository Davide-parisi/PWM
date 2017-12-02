<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="title.registrationok" /></title>
</head>
<body>
	<hr>
	<h3>
		<s:text name="title.registrationok" />
	</h3>
	<div style="background-color: #aaffcc;">
		<s:actionmessage />
	</div>
	
	<div>
		<p>
			<s:text name="text.registrationok">
				<s:param value="user.name" />
				<s:param value="user.username" />
				<s:param value="user.password" />
			</s:text>
		<p>Questa è la tua scheda:</p>

		<ul>
			<li>Cognome: <s:property value="user.cognome" />
			<li>CodiceF: <s:property value="user.codiceF" />
			<li>E-mail: <s:property value="user.email" />
			<li>Data di nascita: <s:property value="user.dataNascita" />
		</ul>

		<p>
			<s:if test="user.accettaCondizioni == true">
        Inoltre hai accettato le condizioni per l'iscrizione.
        </s:if>
			<s:else>
        Non hai accettato le condizioni per l'iscrizione.
        </s:else>
		</p>
		<br />
		
		<s:text name="text.thanks" />
	</div>
	<hr>
</body>

</html>