<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
    <title>Exception</title>
	</head>

	<body>

	  <hr>
	    <h3>Eccezione</h3>  
	    <p>Si è verificata un'eccezione: <s:property value="exception" />
	    </p>
	    <p>Dettagli: <s:property value="exceptionStack" />
	    </p>
      <hr>
	</body>
	
</html>
