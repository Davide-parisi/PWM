<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title><s:text name="global.title.registration" /></title>
	</head>

	<body>
	<s:include value="Header.jsp"></s:include>
	    
	    <div class="product-big-title-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="product-bit-title text-center">
						<h2><s:text name="global.title.registration" /></h2>
					</div>
				</div>
			</div>
		</div>
	</div>
	
		<div style="background-color:#ffaacc;"><s:actionerror/></div>
	    
	<s:form action="Register" style="text-align: center; margin: auto; padding: 30px;">
    	<s:textfield key="global.label.nome" name="cliente.nome"/>
    	<s:textfield label="Cognome" name="cliente.cognome"/>
    	<s:textfield label="Codice Fiscale" requiredLabel="true" name="cliente.codiceF"/>
    	<s:textfield label="Data di nascita (gg/mm/aa)" name="cliente.dataNascita"/>
    	<s:textfield label="Email" name="cliente.email"/>
    	<s:textfield label="Telefono" name="cliente.telefono"/>
    	<s:textfield key="global.label.username" requiredLabel="true" name="cliente.username"/>
    	<s:password key="global.label.password" showPassword="true" requiredLabel="true" name="cliente.password"/>
    	<s:submit value="Registrati" style="margin: 30px;"/>
		</s:form>

	<s:include value="Footer.jsp"></s:include>
	</body>
	
</html>