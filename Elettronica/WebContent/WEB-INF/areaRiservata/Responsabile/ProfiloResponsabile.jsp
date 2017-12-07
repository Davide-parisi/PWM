<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<s:include value="../../../WebApp/Header.jsp"></s:include>
<title><s:text name="global.title.registration" /></title>
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

					<div class="col-md-4">
						<h2 class="sidebar-title">Informazioni Personali</h2>
						<ul>
							<li>Nome: <s:property value="#session.responsabile.nome" />
							<li>Cognome: <s:property
									value="#session.responsabile.cognome" />
							<li>Codice fiscale: <s:property
									value="#session.responsabile.codiceF" />
							<li>Data di nascita: <s:property
									value="#session.responsabile.dataNascita" />
							<li>Email: <s:property value="#session.responsabile.email" />
							<li>Telefono: <s:property
									value="#session.responsabile.telefono" />
						</ul>
					</div>

					<div class="col-md-4">
						<h2 class="sidebar-title">Dati Account</h2>
						<ul>
							<li>Username: <s:property
									value="#session.responsabile.username" />
							<li>Password: <s:property
									value="#session.responsabile.password" />
						</ul>
					</div>




					<div class="col-md-8"></div>

					<div class="col-md-4">
						<h2 class="sidebar-title" style="text-align: center;">Gestisci</h2>


						<div id="side-nav">
							<ul>
								<li onclick="visualizza('menuInserisci')"><a class="button"
									style="display: block; float: none; color: #FFF;">INSERISCI</a>
									<ul id="menuInserisci" class="header-menu-tendina">
										<li><a href="admin/registraAdmin.jsp">Registra Admin</a></li>
										<li><a href="cliente/registraCliente.jsp">Registra
												Cliente</a></li>
										<li><a href="prodotto/registraProdotto.jsp">Registra
												Prodotto</a></li>
												<li><a href="prodotto/registraPromozione.jsp">Registra
												Promozione</a></li>
									</ul></li>

								<li onclick="visualizza('menuModifica')"><a class="button"
									style="display: block; float: none; color: #FFF;">MODIFICA</a>
									<ul id="menuModifica" class="header-menu-tendina">
										<li><a href="VisualizzaAdmins">Modifica Admin</a></li>
										<li><a href="VisualizzaClienti">Modifica Cliente</a></li>
										<li><a href="VisualizzaProdotti">Modifica Prodotto</a></li>
									    <li><a href="VisualizzaPromozioni">Modifica Promozione</a></li>
										<li><a href="GestisciOrdini">Modifica Ordini</a></li>
									</ul></li>

								<li onclick="visualizza('menuExtra')"><a class="button"
									style="display: block; float: none; color: #FFF;">EXTRA</a>
									<ul id="menuExtra" class="header-menu-tendina">
										<li><a href="TopClient">Miglior Cliente</a></li>
										<li><a href="TopClient">Statistiche Vendite</a></li>
									</ul></li>

							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="woocommerce-info" style="text-align: center;">
				<a href="<s:url action='AggiungiR' namespace='/'/>">NOMINA NUOVO
					RESPONSABILE</a>
			</div>
		</div>
	</div>

	<s:include value="../../../WebApp/Footer.jsp"></s:include>
</body>
</html>