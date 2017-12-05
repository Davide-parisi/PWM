<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
    <title><s:text name="title.registrationok" /></title>
	</head>

	<body>
	<s:include value="../../WebApp/Header.jsp"></s:include>
	
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
        <li>Nome: <s:property value="#session.cliente.nome"/>
        <li>Cognome: <s:property value="#session.cliente.cognome"/>
        <li>Codice fiscale: <s:property value="#session.cliente.codiceF"/>
        <li>Data di nascita: <s:property value="#session.cliente.dataNascita"/>
        <li>Email: <s:property value="#session.cliente.email"/>
        <li>Telefono: <s:property value="#session.cliente.telefono"/>
        </ul>
        </div>
        
        <div class="col-md-4">
        <h2 class="sidebar-title">Dati Account</h2>
        <ul>
        <li>Username: <s:property value="#session.cliente.username"/>
        <li>Password: <s:property value="#session.cliente.password"/>
        </ul>
        </div>
        
        <div class="col-md-4">
		<h2 class="sidebar-title">Storico Ordini</h2>
		</div>
		
     	</div>
      </div>
    
     <div class="woocommerce-info" style="text-align: center;"><a href="<s:url action='ModificaAccount' namespace='/'/>">MODIFICA ACCOUNT</a></div>
     <div class="woocommerce-info" style="text-align: center;"><a href="<s:url action='EliminaAccount' namespace='/'/>">ELIMINA ACCOUNT</a></div>
      </div>
     </div>
    <s:include value="../../WebApp/Footer.jsp"></s:include>
	</body>
	
</html>