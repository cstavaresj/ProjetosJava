<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<f:view locale="#{DoencaMB.idioma}">	

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="../resources/css/estilo.css" type="text/css" rel="stylesheet"/>
	<f:loadBundle var="bundle" basename="bundle.Idioma" />
	<title><h:outputText value="#{bundle.TIT_ConsultarDoenca}"/></title>
	<script type="text/javascript">
		statusListener = function(selectObj){
			alert('Alterado.');
		};
	</script>
</head>
	
<body>
	<%@ include file="menu.jsp" %>

	<h:form id="consultaDoenca">
	<center>
		<rich:panel header="Consulta de Doenças" style="width: 600px"> <!-- Painel de Consula de Doenças -->
			<h:panelGrid columns="3"><!-- Botões Novo, Salvar e Pesquisar -->
		
				<h:commandLink id="btnNovo" action="#{DoencaMB.novo}" >  
			 		<h:graphicImage id="imgBtnNovo" url="../resources/img/new.gif" style="border: 0px; Alunor: pointer;"/>
			 		<h:outputLabel for="imgBtnNovo" value="#{bundle.BTN_Novo}" style="Alunor: pointer;"/> 
			 	</h:commandLink>
			 		
			 	<h:commandLink id="btnSalvar" action="#{DoencaMB.salvar}" >  
			 		<h:graphicImage id="imgBtnSalvar" url="../resources/img/save.gif" style="border: 0px; Alunor: pointer;"/>
			 		<h:outputLabel for="imgBtnSalvar" value="#{bundle.BTN_Salvar}" style="Alunor: pointer;"/> 
			 	</h:commandLink>
			 					 		
			 	<h:commandLink id="btnPesquisar" action="#{DoencaMB.pesquisar}" >  
			 		<h:graphicImage id="imgBtnPesquisar" url="../resources/img/find.gif" style="border: 0px; Alunor: pointer;"/>
			 		<h:outputLabel for="imgBtnPesquisar" value="#{bundle.BTN_Pesquisar}" style="Alunor: pointer;"/> 
			 	</h:commandLink>
			 		
			</h:panelGrid><!--Fim dos botões -->
				
				
			<h:panelGrid id="panelMsg" style="height:55px;" >
				<h:messages id="mensagem" errorClass="mensagemErro" warnClass="mensagemSuccess" infoClass="mensagemInfo"/>
			</h:panelGrid>
				
				
			<h:panelGrid id="campos" columns="2" columnClasses="col_label, col_input" width="100%">
				
				<h:column />
				<h:inputHidden value="#{DoencaMB.doenca.id}" />
					 
				<h:outputLabel value="#{bundle.LBL_Doenca}" />
				<h:inputText value="#{DoencaMB.doenca.nome}" style="width: 100%;"/>
				
			</h:panelGrid>
		</rich:panel> <!-- Fim do Painel de Consulta de Doenças -->
	</center>
		<h:panelGrid columns="3" columnClasses="col_esquerda, col_meio, col_direita" width="100%"> <!-- Tabela de consulta -->
			<br />
			<br />
			<h:dataTable id="DoencasEncontrados" value="#{DoencaMB.doencas}" var="Doenca" rowClasses="linhaPar, linhaImpar" width="100%">
				
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_ID}" /> 
					</f:facet>
					<center><h:outputText value="#{Doenca.id}" /></center>
				</h:column>
				
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_NOME_DOENCA}" /> 
					</f:facet>	
					<center><h:outputText value="#{Doenca.nome}" />	</center>
				</h:column>
					
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_EDITAR}" /> 
					</f:facet>
					<center><h:commandLink id="btnEditar" action="#{DoencaMB.exibirParaEdicao}"> 
				 		<h:graphicImage url="../resources/img/edit.gif" style="border: 0px; Alunor: pointer;"/> 
				 		<f:setPropertyActionListener target="#{DoencaMB.doencaSelecionado}" value="#{Doenca}" /> 
				 	</h:commandLink> </center>
				</h:column>
					
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_APAGAR}" /> 
					</f:facet>
					<center><h:commandLink id="btnRemover" action="#{DoencaMB.remover}"> 
				 		<h:graphicImage url="../resources/img/delete.gif" style="border: 0px; Alunor: pointer;"/> 
				 		<f:setPropertyActionListener target="#{DoencaMB.doencaSelecionado}" value="#{Doenca}" /> 
				 	</h:commandLink> </center>
				</h:column>
				    
			</h:dataTable>
			<h:column />
		</h:panelGrid> <!-- Fim da Tabela -->
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
	<%@ include file="rodape.jsp" %>