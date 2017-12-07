<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<s:include value="../../../WebApp/Header.jsp"></s:include>
<title>MODIFICA PROFILO</title>
</head>

<body>

	<div class="product-big-title-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="product-bit-title text-center">
						<h2>MODIFICA PROFILO</h2>
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
						<s:form action="ModificaCliente">
						<s:textfield name="idAccount" label="id" value="%{session.cliente.idAccount}" readonly="true"/>
						<s:textfield name="nome" key="global.label.nome" value="%{#session.cliente.nome}" readonly="true"/>
							<s:textfield name="cognome" label="Cognome" value="%{#session.cliente.cognome}" readonly="true"/>
							<s:textfield name="codiceF" label="Codice Fiscale"
								requiredLabel="true" value="%{#session.cliente.codiceF}" readonly="true"/>
							<s:textfield name="dataNascita"
								label="Data di nascita (gg/mm/aa)" value="%{#session.cliente.dataNascita}" readonly="true"/>
							<s:textfield name="email" label="Email" value="%{#session.cliente.email}" />
							<s:textfield name="telefono" label="Telefono"
								value="%{#session.cliente.telefono}" />
							<s:textfield name="username" key="global.label.username"
								value="%{#session.cliente.username}" />
							<s:password name="password" key="global.label.password"
								showPassword="true" value="%{#session.cliente.password}" />
							<s:submit value="Modifica" style="margin: 30px;" />
						</s:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<s:include value="../../../WebApp/Footer.jsp"></s:include>
</body>

</html>