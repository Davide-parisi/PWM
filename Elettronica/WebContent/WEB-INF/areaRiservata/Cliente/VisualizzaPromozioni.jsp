<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<s:include value="../../../WebApp/Header.jsp"></s:include>
<title>PROMOZIONI</title>
</head>

<body>

	<div class="product-big-title-area">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="product-bit-title text-center">
						<h2>PROMOZIONI</h2>
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
					<s:if test="%{promozioni.size()!=0}">
					
					<div class="col-md-4">
						<h2 class="sidebar-title">Promozioni Ottenute</h2>
						<ul>
							<li>Totale Punti: <s:property value="%{tessera.totalePunti}"/>
							<li>Scadenza: <s:property value="%{tessera.validita}"/>
						</ul>
					</div>
					</s:if>

				</div>
			</div>
		</div>
	</div>
	<s:include value="../../../WebApp/Footer.jsp"></s:include>
</body>

</html>