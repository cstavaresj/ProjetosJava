<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<f:view locale="#{VirusMB.idioma}">	

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="../resources/css/estilo.css" type="text/css" rel="stylesheet"/>
	<f:loadBundle var="bundle" basename="bundle.Idioma" />
	<title><h:outputText value="#{bundle.TIT_ConsultarVirus}"/></title>
	<script type="text/javascript">
		statusListener = function(selectObj){
			alert('Alterado.');
		};
	</script>
</head>
	
<body>
   <%@ include file="menu.jsp" %>
		
	<h:form id="consultaVirus">
	<center>
		<rich:panel header="Consulta de Virus" style="width: 600px"> <!-- Painel de Consula de Virus -->
			<h:panelGrid columns="3"><!-- Botões Novo, Salvar e Pesquisar -->
		
				<h:commandLink id="btnNovo" action="#{VirusMB.novo}" >  
			 		<h:graphicImage id="imgBtnNovo" url="../resources/img/new.gif" style="border: 0px; Virusr: pointer;"/>
			 		<h:outputLabel for="imgBtnNovo" value="#{bundle.BTN_Novo}" style="Virusr: pointer;"/> 
			 	</h:commandLink>
			 		
			 	<h:commandLink id="btnSalvar" action="#{VirusMB.salvar}" >  
			 		<h:graphicImage id="imgBtnSalvar" url="../resources/img/save.gif" style="border: 0px; Virusr: pointer;"/>
			 		<h:outputLabel for="imgBtnSalvar" value="#{bundle.BTN_Salvar}" style="Virusr: pointer;"/> 
			 	</h:commandLink>
			 					 		
				<h:commandLink id="btnPesquisar" action="#{VirusMB.pesquisar}" >  
					<h:graphicImage id="imgBtnPesquisar" url="../resources/img/find.gif" style="border: 0px; Virusr: pointer;"/>
				 	<h:outputLabel for="imgBtnPesquisar" value="#{bundle.BTN_Pesquisar}" style="Virusr: pointer;"/> 
				</h:commandLink>
			 		
			</h:panelGrid> <!--Fim dos botões -->
				
				
			<h:panelGrid id="panelMsg" style="height:55px;" > <!--Campo para as mensagens -->
				<h:messages id="mensagem" errorClass="mensagemErro" warnClass="mensagemSuccess" infoClass="mensagemInfo"/>
			</h:panelGrid>
		
			<h:panelGrid id="campos" columns="2" columnClasses="col_label, col_input" width="100%">
				
				<h:column />
				<h:inputHidden value="#{VirusMB.virus.id}" />
					 
				<h:outputLabel value="#{bundle.LBL_Virus}"/>
				<h:inputText value="#{VirusMB.virus.nome}" style="width: 100%;"/>
					
				<h:outputLabel value="#{bundle.LBL_Tipo}" />
				<h:selectOneRadio value="#{VirusMB.virus.tipo}">
					<f:selectItem itemLabel="DNA" itemValue="DNA"/>
					<f:selectItem itemLabel="RNA" itemValue="RNA"/>
					<f:selectItem itemLabel="DNA ou RNA" itemValue="DNA ou RNA"/>
				</h:selectOneRadio>
					
				<h:outputLabel value="#{bundle.LBL_Vacina}" />
				<h:selectOneRadio value="#{VirusMB.virus.existe_vacina}">
					<f:selectItem itemLabel="#{bundle.Sim}" itemValue="true"/>
					<f:selectItem itemLabel="#{bundle.Nao}" itemValue="false"/>
				</h:selectOneRadio>
							
				<h:outputLabel value="#{bundle.LBL_Doenca}" />
				
				<h:selectOneMenu value="#{VirusMB.idDoencaSelecionado}">
					<f:selectItems value="#{VirusMB.listaDoencasCombobox}" />
				</h:selectOneMenu>
				
			</h:panelGrid>
		</rich:panel> <!-- Fim do Painel de Consula de Virus -->
	</center>
	
		<h:panelGrid columns="3" columnClasses="col_esquerda, col_meio, col_direita" width="100%"> <!-- Tabela de consulta -->
			<br />
			<br />
			<h:dataTable id="VirussEncontrados" value="#{VirusMB.viruss}" var="Virus" rowClasses="linhaPar, linhaImpar" width="100%">
			
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_ID}" /> 
					</f:facet>
					<center><h:outputText value="#{Virus.id}" /></center> 
				</h:column>
				
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_NOME_VIRUS}" /> 
					</f:facet>
					<center><h:outputText value="#{Virus.nome}" /></center>
				</h:column>
				
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_TIPO}" /> 
					</f:facet>
					<center><h:outputText value="#{Virus.tipo}" /></center>
				</h:column>
					
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_VACINA}" /> 
					</f:facet>		
					<center><h:outputText value="#{Virus.status}" /></center>
				</h:column>
				
				
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_DOENCA_CAUSA}" /> 
					</f:facet>
					<center><h:outputText value="#{Virus.tbDoenca.nome}" /></center>
				</h:column>
					
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_EDITAR}" /> 
					</f:facet>
					<center><h:commandLink id="btnEditar" action="#{VirusMB.exibirParaEdicao}"> 
						<h:graphicImage url="../resources/img/edit.gif" style="border: 0px; Virusr: pointer;"/> 
				 		<f:setPropertyActionListener target="#{VirusMB.virusSelecionado}" value="#{Virus}" /> 
				 	</h:commandLink></center>
				</h:column>
					
				<h:column>
					<f:facet name="header"> 
						<h:outputText value="#{bundle.COL_APAGAR}" /> 
					</f:facet>
					<center><h:commandLink id="btnRemover" action="#{VirusMB.remover}"> 
						<h:graphicImage url="../resources/img/delete.gif" style="border: 0px; Virusr: pointer;"/> 
						<f:setPropertyActionListener target="#{VirusMB.virusSelecionado}" value="#{Virus}" /> 
					</h:commandLink></center>
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