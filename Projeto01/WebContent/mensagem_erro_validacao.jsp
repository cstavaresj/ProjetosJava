<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Erro</title>
<jsp:include page="css/estilo.css"/>
</head>
<body>
<center>
	<jsp:include page="menu.jsp"/>
	<br>
	<h2>Favor preencher corretamente todos os campos!</h2>
	<br><br>
	<input type="button" value="Voltar" onclick="window.history.go(-1)">
</center>
</body>
</html>