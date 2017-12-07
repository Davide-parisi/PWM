<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<head>
<s:include value="../../../WebApp/Header.jsp"></s:include>
<title>AGGIUNGI RESPONSABILE</title>
</head>

<body>

	<div class="product-big-title-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="product-bit-title text-center">
						<h2>AGGIUNGI RESPONSABILE</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div style="background-color: #ffaacc;">
		<s:actionerror />
	</div>
	<div class="maincontent-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="login-form-wrap">

						<s:form action="AggiungiResponsabile" namespace="/">
							<s:textfield name="nome" key="global.label.nome" />
							<s:textfield name="cognome" label="Cognome" />
							<s:textfield name="codiceF" label="Codice Fiscale"
								requiredLabel="true" />
							<s:textfield name="dataNascita"
								label="Data di nascita (gg/mm/aa)" />
							<s:textfield name="email" label="Email" />
							<s:textfield name="telefono" label="Telefono" />
							<s:textfield name="username" key="global.label.username"
								requiredLabel="true" />
							<s:password name="password" key="global.label.password"
								showPassword="true" requiredLabel="true" />
							<s:submit value="Aggiungi" style="margin: 30px;" />
						</s:form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<s:include value="../../../WebApp/Footer.jsp"></s:include>
</body>

</html>