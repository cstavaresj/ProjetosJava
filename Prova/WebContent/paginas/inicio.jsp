<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<html>
<f:view locale="#{VirusMB.idioma}">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link href="../resources/css/estilo.css" type="text/css"rel="stylesheet" />
		<f:loadBundle var="bundle" basename="bundle.Idioma" />
		<title><h:outputText value="#{bundle.TIT_Inicio}" /></title>
	</head>

	<body>
		<%@ include file="menu.jsp"%>

		<h:form>
			<br>
			<p>
				<h:outputText value="#{bundle.TXT_Inicio}" />
			</p>
			<br>

		</h:form>
	</body>
</f:view>
</html>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<jsp:include page="rodape.jsp" />