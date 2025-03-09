<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:html>
	<head>
		<title>Cadastrar Clientes</title>
		<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
		<jsp:include page="css/estilo.css"/>
	</head>
	<jsp:include page="menu.jsp"/>
	<html:errors/>
	<html:form action="/novoCliente" focus="cliente.nome">
	<br>
	<center>
	<table style="border:1px solid black;" width="30%" bgcolor="silver">
		<tr style="background-color: #00b300;color: white;">
			<td colspan="2" align="center" style="font-weight:bold">CADASTRO DE CLIENTES</td>
		</tr>
		<tr>
			<td>Nome: </td>
			<td><html:text property="cliente.nome"/></td>
		</tr>
		<tr>
			<td>Data de Nascimento: </td>
			<td><html:text property="cliente.nascimento"/></td>
		</tr>
		<tr>
			<td>CPF: </td>
			<td><html:text property="cliente.cpf"/></td>
		</tr>
		<tr>
			<td>Endereço: </td>
			<td><html:text property="cliente.endereco"/></td>
		</tr>
		<tr>
			<td>Telefone:</td>
			<td><html:text property="cliente.telefone"/></td>
		</tr>
		<tr>
			<td>Email: </td>
			<td><html:text property="cliente.email"/></td>
		</tr>
		
	</table>
	<br>
		<html:submit>Enviar dados</html:submit>
	</center>
	</html:form>
</html:html>