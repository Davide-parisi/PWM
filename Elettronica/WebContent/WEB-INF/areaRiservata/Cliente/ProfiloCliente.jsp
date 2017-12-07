<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<s:include value="../../../WebApp/Header.jsp"></s:include>
<title><s:text name="title.registrationok" /></title>
</head>

<body>
	<script type="text/javascript" language="javascript">
		function visualizza(id) {
			if (document.getElementById) {
				if (!document.getElementById(id).style.display) {
					document.getElementById(id).style.display = 'block';
				} else if (document.getElementById(id).style.display == 'none') {

					document.getElementById(id).style.display = 'block';
				} else {
					document.getElementById(id).style.display = 'none';
				}
			}
		}
		window.onload = Start();
	</script>

	<div class="product-big-title-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="product-bit-title text-center">
						<h2>Area Riservata</h2>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="profileContainer">
		<div class="container">
			<div class="row">
				<div class="single-sidebar">
					<s:actionmessage />
					<div class="col-md-4">
						<h2 class="sidebar-title">Informazioni Personali</h2>
						<ul>
						<li>ID: <s:property value="#session.cliente.idAccount" />
							<li>Nome: <s:property value="#session.cliente.nome" />
							<li>Cognome: <s:property value="#session.cliente.cognome" />
							<li>Codice fiscale: <s:property
									value="#session.cliente.codiceF" />
							<li>Data di nascita: <s:property
									value="#session.cliente.dataNascita" />
							<li>Email: <s:property value="#session.cliente.email" />
							<li>Telefono: <s:property value="#session.cliente.telefono" />
						</ul>
					</div>

					<div class="col-md-4">
						<h2 class="sidebar-title">Dati Account</h2>
						<ul>
							<li>Username: <s:property value="#session.cliente.username" />
							<li>Password: <s:property value="#session.cliente.password" />
						</ul>
					</div>

					<div class="col-md-4">
						<h2 class="sidebar-title">Storico Ordini</h2>
					</div>




					<div class="col-md-8"></div>

					<div class="col-md-4">
						<h2 class="sidebar-title" style="text-align: center;">Gestisci</h2>


						<div id="side-nav">
							<ul>
								<li onclick="visualizza('menuTessera')"><a class="button"
									style="display: block; float: none; color: #FFF;">TESSERA</a>
									<ul id="menuTessera" class="header-menu-tendina">
										<li><a href="cliente/visualizzaTessera.jsp">La mia
												Tessera Fedeltà</a></li>
									</ul></li>

								<li onclick="visualizza('menuPromozioni')"><a
									class="button"
									style="display: block; float: none; color: #FFF;">PROMOZIONI</a>
									<ul id="menuPromozioni" class="header-menu-tendina">
										<li><a href="cliente/visualizzaPromozioni.jsp">Le mie
												Promozioni</a></li>
									</ul></li>

							</ul>
						</div>
					</div>
				</div>

				<div class="woocommerce-info" style="text-align: center;">
					<a href="<s:url action='ModificaProfilo' namespace='/'/>">MODIFICA
						ACCOUNT</a>
				</div>
				<div class="woocommerce-info" style="text-align: center;">
					<a href="<s:url action='EliminaProfilo' namespace='/'/>">ELIMINA
						ACCOUNT</a>
				</div>
			</div>
		</div>
		<s:include value="../../../WebApp/Footer.jsp"></s:include>
</body>

</html>