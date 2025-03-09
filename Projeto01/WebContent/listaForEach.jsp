<%@taglib uri="/WEB-INF/c.tld" prefix="c" %>
<html>
	<c:forEach var="cliente" items="${clientes}">
		${cliente.nome} - ${cliente.nascimento} - ${cliente.cpf} - ${cliente.endereco} - ${cliente.telefone} - ${cliente.email}<br/>
	</c:forEach>
</html>
