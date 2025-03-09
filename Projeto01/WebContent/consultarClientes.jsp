<%@page import ="java.util.*,br.uniube.model.*"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:html>
	<head>
		<title>Consultar Clientes</title>
	</head>
	<jsp:include page="css/estilo.css"/>
	<jsp:include page="menu.jsp"/>
	<html:errors/>
	<html:form action="/clientes" focus="cliente.nome">
		<br>
		<center>
		<table style="border:1px solid black;" width="30%" bgcolor="silver">
			<tr style="background-color: #00b300;color: white;">
				<td colspan="3" align="center" style="font-weight:bold">CONSULTA DE CLIENTES</td>
			</tr>
			<tr>
				<td>Nome: </td>
				<td><html:text property="cliente.nome"/></td>
				<td><html:submit>Consultar</html:submit></td>
			</tr>
		</table>
		</center>
	</html:form>
	
	<%
	List clientes = (List) request.getAttribute("clientes");
	
	if (clientes != null) {
		%>
		<center>
		<table style="border:1px solid black;" width="50%" bgcolor="silver">
		<tr style="background-color: #00b300;color: white;">
			<td align="center">Nome</td>
			<td align="center">Data de Nascimento</td>
			<td align="center">CPF</td>
			<td align="center">Endereço</td>
			<td align="center">Telefone</td>
			<td align="center">Email</td>
			<td align="center">Excluir</td>
			<td align="center">Alterar</td>
		</tr>
		<%
		for(int i = 0; i < clientes.size(); i++) {
			Cliente cliente = (Cliente)clientes.get(i);
			%>
			<tr>
				<td><%=cliente.getNome()%></td>
				<td><%=cliente.getNascimento()%></td>
				<td><%=cliente.getCpf()%></td>
				<td><%=cliente.getEndereco()%></td>
				<td><%=cliente.getTelefone()%></td>
				<td><%=cliente.getEmail()%></td>
				<td align="center"><a href="excluir.do?id=<%=cliente.getId()%>"><img src="imagens/excluir.png" width="20px" heigth="20px"></a></td>
				<td align="center"><a href="consultaAlterar.do?id=<%=cliente.getId()%>"><img src="imagens/alterar.png" width="20px" heigth="20px"></a></td>
			</tr>
	<%
		}
		%></table></center><%
		if (clientes.size() == 0) {
			%>
			<br> <center>Nenhum cliente encontrado!</center>
			<%		
		}
	}
%>	
</html:html>