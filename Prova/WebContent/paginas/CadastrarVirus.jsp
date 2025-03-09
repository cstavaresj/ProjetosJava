<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../resources/css/estilo.css" type="text/css"
	rel="stylesheet" />
<f:loadBundle var="bundle" basename="bundle.Idioma" />
<title><h:outputText value="#{bundle.TIT_CadastrarVirus}" /></title>
</head>
<body>

	<%@ include file="menu.jsp"%>
	<!-- Inclui a barra de MENU -->

	<center>
		<h:form id="cadastroVirus">

			<rich:panel header="Cadastro de Vírus" style="width: 600px">

				<h:panelGrid columns="3">
					<!-- Botões Novo e Salvar -->
					<h:commandLink id="btnNovo" action="#{VirusMB.novo}">
						<h:graphicImage id="imgBtnNovo" url="../resources/img/new.gif"
							style="border: 0px; Virusr: pointer;" />
						<h:outputLabel for="imgBtnNovo" value="#{bundle.BTN_Novo}"
							style="Virusr: pointer;" />
					</h:commandLink>

					<h:column />

					<h:commandLink id="btnSalvar" action="#{VirusMB.salvar}">
						<h:graphicImage id="imgBtnSalvar" url="../resources/img/save.gif"
							style="border: 0px; Cargor: pointer;" />
						<h:outputLabel for="imgBtnSalvar" value="#{bundle.BTN_Salvar}"
							style="Cargor: pointer;" />
					</h:commandLink>
				</h:panelGrid>

				<h:panelGrid id="panelMsg" style="height:55px;">
					<!-- Espaço para Mensagens -->
					<h:messages id="mensagem" errorClass="mensagemErro"
						warnClass="mensagemSuccess" infoClass="mensagemInfo" />
				</h:panelGrid>


				<h:panelGrid id="campos" columns="2"
					columnClasses="col_label, col_input" width="100%">
					<!-- Formulário de cadastro -->

					<h:column />
					<h:inputHidden value="#{VirusMB.virus.id}" />


					<h:outputLabel value="#{bundle.LBL_Virus}" />
					<h:inputText value="#{VirusMB.virus.nome}" style="width: 100%;" />


					<h:outputLabel value="#{bundle.LBL_Tipo}"/>
					<h:selectOneRadio value="#{VirusMB.virus.tipo}">
						<f:selectItem itemLabel="DNA" itemValue="DNA" />
						<f:selectItem itemLabel="RNA" itemValue="RNA" />
						<f:selectItem itemLabel="DNA ou RNA" itemValue="DNA ou RNA" />
					</h:selectOneRadio>


					<h:outputLabel value="#{bundle.LBL_Vacina}" />
					<h:selectOneRadio value="#{VirusMB.virus.existe_vacina}">
						<f:selectItem itemLabel="#{bundle.Sim}" itemValue="true" />
						<f:selectItem itemLabel="#{bundle.Nao}" itemValue="false" />
					</h:selectOneRadio>



					<h:outputLabel value="#{bundle.LBL_Doenca}" />

					<h:selectOneMenu value="#{VirusMB.idDoencaSelecionado}">
						<f:selectItems value="#{VirusMB.listaDoencasCombobox}" />
					</h:selectOneMenu>

				</h:panelGrid>
			</rich:panel>

		</h:form>
	</center>
</f:view>
</body>
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
<%@ include file="rodape.jsp"%>