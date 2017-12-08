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
							<s:textfield name="email" label="Email" value="%{#session.cliente.email}" />
							<s:textfield name="telefono" label="Telefono"
								value="%{#session.cliente.telefono}" />
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