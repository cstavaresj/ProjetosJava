<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@page import ="br.uniube.model.*"%>
<html:html>
	<head>
		<title>Altera Cadastro</title>
		<script language="JavaScript" src="js/funcoes.js"></script>
		<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
	</head>
	<jsp:include page="css/estilo.css"/>
	<jsp:include page="menu.jsp"/>
	
	<%
	    Cliente cliente = (Cliente) request.getAttribute("cliente");
		String id="", nome="", nascimento="", cpf="", endereco="", telefone="", email=""; 
		if (cliente != null) {
			id = String.valueOf(cliente.getId());
			nome = cliente.getNome();
			nascimento = cliente.getNascimento();
			cpf = cliente.getCpf();
			endereco = cliente.getEndereco();
			telefone = cliente.getTelefone();
			email = cliente.getEmail();
		}	
    %>
	<html:errors/>
	<br>
	<center>
	<html:form action="/alterar" focus="cliente.nome" onsubmit="return funValidaCampos();">
			
		<table style="border:1px solid black;" width="30%" bgcolor="silver">
		<tr style="background-color: #00b300;color: white;">
			<td colspan="2" align="center" style="font-weight:bold">ALTERAR DADOS</td>
		</tr>
		<html:hidden property="cliente.id" value="<%=id%>"/>
		<tr>
			<td>Nome: </td>
			<td><html:text property="cliente.nome" value="<%=nome%>"/></td>
		</tr>
		<tr>
			<td>Data de Nascimento: </td>
			<td><html:text property="cliente.nascimento" value="<%=nascimento%>"/></td>
		</tr>
		<tr>
			<td>CPF: </td>
			<td><html:text property="cliente.cpf" value="<%=cpf%>"/></td>
		</tr>
		<tr>
			<td>Endereço: </td>
			<td><html:text property="cliente.endereco" value="<%=endereco%>"/></td>
		</tr>
		<tr>
			<td>Telefone: </td>
			<td><html:text property="cliente.telefone" value="<%=telefone%>"/></td>
		</tr>
		<tr>
			<td>Email: </td>
			<td><html:text property="cliente.email" value="<%=email%>"/></td>
		</tr>
		
	</table>
     	<br><html:submit>Salvar Alterações</html:submit><br/>
	</html:form>
	</center>
</html:html>