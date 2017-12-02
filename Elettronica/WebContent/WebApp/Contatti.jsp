<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contatti</title>
</head>
<body>
	<!-- begin #header -->
   <jsp:include page="Header.jsp"></jsp:include>
    <!-- end #header -->

<div class="product-big-title-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="product-bit-title text-center">
						<h2>Contatti</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
	
<div class="row">
<div class="col-md-6">
<div class="contatti-left">
<div class="titolo-contatti">Dove Siamo</div>
<div class="googlemap_wrap">
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3138.8163742698985!2d15.663173115794423!3d38.121206179697886!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x13145087d3bc2859%3A0x59b7d9d6809ae5c6!2sUniversit%C3%A0+Mediterranea+-+Facolt%C3%A0+di+Ingegneria!5e0!3m2!1sit!2sit!4v1511888761522" width="100%" height="100%" frameborder="0" style="border:0" allowfullscreen></iframe>
</div>
</div>	
</div>		
<div class="col-md-6">
<div class="contatti-right">
<div class="titolo-contatti">Modulo di contatto</div>
<div style="background-color:#ffaacc;"><s:actionerror/></div>
	    
	<s:form action="Register" style="text-align: center; margin: auto; padding: 30px;">
    	<s:textfield name="user.name" label="Nome" requiredLabel="true"/>
    	<s:textfield name="user.name" label="Cognome" requiredLabel="true"/>
    	<s:textfield  name="user.email" label="Email" requiredLabel="true"/>
    	<s:checkbox name="user.accettaCondizioni" label="Accetti le condizioni?"/>
    	
    	<s:submit style="margin: 30px;"/>
		</s:form>
</div>
</div>	
</div>
    <!-- begin #footer -->
    <jsp:include page="Footer.jsp"></jsp:include>
    <!-- end #footer -->
</body>
</html>