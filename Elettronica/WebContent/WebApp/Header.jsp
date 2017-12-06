<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String root = request.getSession().getServletContext().getContextPath();
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Google Fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,100'
	rel='stylesheet' type='text/css'>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href=<%=root + "/WebApp/css/owl.carousel.css"%>>
<link rel="stylesheet" href=<%=root + "/WebApp/css/style.css"%>>
<link rel="stylesheet" href=<%=root + "/WebApp/css/responsive.css"%>>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="header-area">
		<div class="container">
			<div class="row">
				<div class="col-md-8">
					<div class="user-menu">
					
						<s:if test="#session['cliente']!=null">

							<li><a href="<s:url action='AreaRiservataCliente' namespace='/secure'/>"><i class="fa fa-user"></i> My Account</a></li>

						</s:if>

						<s:if test="#session['responsabile']!=null">

							<li><a href="<s:url action='AreaRiservataResponsabile' namespace='/secure'/>"><i class="fa fa-user"></i> My Account</a></li>

						</s:if>

						<li><a href="#"><i class="fa fa-heart"></i> Wishlist</a></li>

						<li><a href=<%=root + "/secure/Authenticated"%>><i class="fa fa-user"></i> My Cart</a></li> <%-- Da sistemare link --%>

						<s:if test="%{(#session.isEmpty())}">

							<li><a href="<s:url action='LoginForm' namespace='/'/>"><i class="fa fa-user"></i>Login</a></li>

						</s:if>

						<s:if test="%{!(#session.isEmpty())}">

							<li><a href="<s:url action='Logout' namespace='/'/>"><i class="fa fa-user"></i>Logout</a></li>

						</s:if>
					</div>
				</div>

				<%-- <div class="col-md-4">   Qui vanno aggiunti i link ai social
					<div class="header-right">
						<ul class="list-unstyled list-inline">
							<li class="dropdown dropdown-small"><a
								data-toggle="dropdown" data-hover="dropdown"
								class="dropdown-toggle" href="#"><span class="key">currency
										:</span><span class="value">USD </span><b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="#">USD</a></li>
									<li><a href="#">INR</a></li>
									<li><a href="#">GBP</a></li>
								</ul></li>

							<li class="dropdown dropdown-small"><a
								data-toggle="dropdown" data-hover="dropdown"
								class="dropdown-toggle" href="#"><span class="key">language
										:</span><span class="value">English </span><b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="#">English</a></li>
									<li><a href="#">French</a></li>
									<li><a href="#">German</a></li>
								</ul></li>
						</ul>
					</div>
				</div> --%>
			</div>
		</div>
	</div>
	<!-- End header area -->

	<div class="site-branding-area">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<div class="logo">
						<h1>
							<a href="<s:url action='Home' namespace='/'/>">pwm<span>Electronics</span></a>
						</h1>
					</div>
				</div>

				<div class="col-sm-6">
					<div class="shopping-item">
						<a href=<%=root + "/WebApp/Cart.jsp"%>>Cart - <span
							class="cart-amunt">$800</span> <i class="fa fa-shopping-cart"></i>
							<span class="product-count">5</span></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End site branding area -->

	<div class="mainmenu-area">
		<div class="container">
			<div class="row">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="<s:url action='Home' namespace='/'/>">Home</a></li>
						<li><a href=<%=root + "/WebApp/Catalogo.jsp"%>>Shop page</a></li>  <!-- Sistemare tutti i link seguenti -->
						<li><a href=<%=root + "/WebApp/SingleProduct.jsp"%>>Single
								product</a></li>
						<li><a href=<%=root + "/WebApp/Cart.jsp"%>>Cart</a></li>
						<li><a href=<%=root + "/WebApp/Checkout.jsp"%>>Checkout</a></li>
						<li><a href="#">Category</a></li>
						<li><a href="#">Others</a></li>
						<li><a href=<%=root + "/secure/Contatti"%>>Contact</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- End mainmenu area -->


</body>
</html>