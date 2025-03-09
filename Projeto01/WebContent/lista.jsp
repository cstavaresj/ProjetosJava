<%@page import ="java.util.*,br.uniube.model.*"%>
<html>
<jsp:include page="css/estilo.css"/>
<jsp:include page="menu.jsp"/>
<%
	
%><center><hr />
	<h2>Cliente cadastrado com sucesso!</h2><%
	
	List clientes = (List) request.getAttribute("clientes");
	
	if (clientes != null) {
		%>
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
		%></table><%
	}
	if (clientes.size() == 0) {
		%>
		<br> Nenhum cliente encontrado
		<%		
	}
%>
</center>
</html>	