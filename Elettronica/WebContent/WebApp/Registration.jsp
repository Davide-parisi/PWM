<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title><s:text name="title.registration" /></title>
	</head>

	<body>
	<jsp:include page="Header.jsp"></jsp:include>
	    
	    <div class="product-big-title-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="product-bit-title text-center">
						<h2><s:text name="title.registration" /></h2>
					</div>
				</div>
			</div>
		</div>
	</div>
	
		<div style="background-color:#ffaacc;"><s:actionerror/></div>
	    
	<s:form action="Register" style="text-align: center; margin: auto; padding: 30px;">
    	<s:textfield name="user.name" key="label.user.name"/>
    	<s:textfield name="user.username" key="label.user.username" requiredLabel="true"/>
    	<s:password name="user.password" key="label.user.password" showPassword="true" requiredLabel="true"/>
    	<s:textfield name="user.dataDiNascita" label="Data di nascita (gg/mm/aa)"/>
    	<s:textfield name="user.email" label="Email"/>
    	<s:select name="user.sesso" label="Sesso (M o F)" list="#{'M':'Maschio', 'F':'Femmina'}"/>
    	<s:checkbox name="user.accettaCondizioni" label="Accetti le condizioni?"/>
    	
    	<s:submit style="margin: 30px;"/>
		</s:form>

	<jsp:include page="Footer.jsp"></jsp:include>
	</body>
	
</html>
