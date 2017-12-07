<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<head>
<s:include value="Header.jsp"></s:include>
<title><s:text name="global.title.registration" /></title>
</head>

<body>

	<div class="product-big-title-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="product-bit-title text-center">
						<h2>
							<s:text name="global.title.registration" />
						</h2>
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
						<s:form action="Register">
							<s:textfield name="cliente.nome" key="global.label.nome" />
							<s:textfield name="cliente.cognome" label="Cognome" />
							<s:textfield name="cliente.codiceF" label="Codice Fiscale"
								requiredLabel="true" />
							<s:textfield name="cliente.dataNascita"
								label="Data di nascita (gg/mm/aa)" />
							<s:textfield name="cliente.email" label="Email" />
							<s:textfield name="cliente.telefono" label="Telefono" />
							<s:textfield name="cliente.username" key="global.label.username"
								requiredLabel="true" />
							<s:password name="cliente.password" key="global.label.password"
								showPassword="true" requiredLabel="true" />

							<s:submit style="margin: 30px;" />
						</s:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<s:include value="Footer.jsp"></s:include>
</body>

</html>