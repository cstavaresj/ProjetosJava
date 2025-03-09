<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Clientes</title>
<jsp:include page="css/estilo.css"/>
</head>
<body>
	<jsp:include page="menu.jsp"/>
	<center><h2>Olá, bem vindo a página de Cadastro e Consulta de clientes!</h2>
		<br>
		<i><b> Clique no botão desejado: </b></i>
		<br>
		<br>
		<a href="novoCliente.jsp"><button>Cadastrar Cliente</button></a>&nbsp;&nbsp;
		<a href="consultarClientes.jsp"><button>Consultar Cliente</button></a>
	</center>
</body>
</html>