<!-- 
	Author     : Luciene Chagas de Oliveira
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view locale="#{CargoMB.idioma}">	

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="../resources/css/estilo.css" type="text/css" rel="stylesheet"/>
	<f:loadBundle var="bundle" basename="bundle.Exemplo" />
	<title><h:outputText value="#{bundle.TIT_Cargo}"/></title>
	<script type="text/javascript">
		statusListener = function(selectObj){
			alert('Alterado.');
		};
	</script>
</head>
	
<body>

	<h:form id="formCargo">
		
		<center>
			<h:panelGrid id="idiomas" columns="3">
				<h:commandLink id="btnBrasil" action="#{CargoMB.idiomaPortugues}" >  
			 		<h:graphicImage id="imgBtnBrasil" url="../resources/img/bandeira_brasil.gif" style="border: 0px; Cursor: pointer;"/>
		 		</h:commandLink>
		 		<h:column/>
		 		<h:commandLink id="btnEua" action="#{CargoMB.idiomaIngles}">  
		 			<h:graphicImage id="imgBtnEua" url="../resources/img/bandeira_eua.gif" style="border: 0px; Cursor: pointer;"/>
		 		</h:commandLink>
			</h:panelGrid>
		</center>
		
		<center>
			<h:panelGrid id="menu" columns="6">
				<h:commandLink value="#{bundle.MENU_Cargo}" action="cadastroCargo"/>				
			</h:panelGrid>
		</center>
		
		<h:panelGrid columns="3" columnClasses="col_esquerda, col_meio, col_direita" width="100%">
		
			<h:column></h:column>
			<h:column>
				
				<h:panelGrid columns="3">
		
					<h:commandLink id="btnNovo" action="#{CargoMB.novo}" >  
			 			<h:graphicImage id="imgBtnNovo" url="../resources/img/new.gif" style="border: 0px; Cargor: pointer;"/>
			 			<h:outputLabel for="imgBtnNovo" value="#{bundle.BTN_Novo}" style="Cargor: pointer;"/> 
			 		</h:commandLink>
			 		
			 		<h:commandLink id="btnSalvar" action="#{CargoMB.salvar}" >  
			 			<h:graphicImage id="imgBtnSalvar" url="../resources/img/save.gif" style="border: 0px; Cargor: pointer;"/>
			 			<h:outputLabel for="imgBtnSalvar" value="#{bundle.BTN_Salvar}" style="Cargor: pointer;"/> 
			 		</h:commandLink>
			 					 		
			 		<h:commandLink id="btnPesquisar" action="#{CargoMB.pesquisar}" >  
			 			<h:graphicImage id="imgBtnPesquisar" url="../resources/img/find.gif" style="border: 0px; Cargor: pointer;"/>
			 			<h:outputLabel for="imgBtnPesquisar" value="#{bundle.BTN_Pesquisar}" style="Cargor: pointer;"/> 
			 		</h:commandLink>
			 		
				</h:panelGrid>
				
				
				<h:panelGrid id="panelMsg" style="height:55px;" >
					<h:messages id="mensagem" errorClass="mensagemErro" warnClass="mensagemSuccess" infoClass="mensagemInfo"/>
				</h:panelGrid>
				
				
				<h:panelGrid id="campos" columns="2" columnClasses="col_label, col_input" width="80%">
				
					<h:column />
					<h:inputHidden value="#{CargoMB.cargo.codigo}" />
					
					<h:outputLabel value="#{bundle.LBL_Nome}" />
					<h:inputText value="#{CargoMB.cargo.nome}" style="width: 100%;"/>
					
					<h:outputLabel value="#{bundle.LBL_Ativo}" />
					<h:selectOneRadio value="#{CargoMB.cargo.ativo}">
						<f:selectItem itemLabel="#{bundle.Sim}" itemValue="true"/>
						<f:selectItem itemLabel="#{bundle.Nao}" itemValue="false"/>
					</h:selectOneRadio>
					
									
				</h:panelGrid>
				
				
				<br />
				<br />
				<h:dataTable id="CargosEncontrados" value="#{CargoMB.cargos}" var="cargo" rowClasses="linhaPar, linhaImpar" width="100%">
				
					<h:column>
						<f:facet name="header"> 
							<h:outputText value="#{bundle.COL_Codigo}" /> 
						</f:facet>
						<h:outputText value="#{cargo.codigo}" /> 
					</h:column>
					
					<h:column>
						<f:facet name="header"> 
							<h:outputText value="#{bundle.COL_Nome}" /> 
						</f:facet>
						<h:outputText value="#{cargo.nome}" /> 
					</h:column>
				
					<h:column>
						<f:facet name="header"> 
							<h:outputText value="#{bundle.COL_Ativo}" /> 
						</f:facet>
						
						<h:outputText value="#{cargo.status}" />
							
					</h:column>
					
					<h:column>
						<h:commandLink id="btnEditar" action="#{CargoMB.exibirParaEdicao}"> 
				 			<h:graphicImage url="../resources/img/edit.gif" style="border: 0px; Cargor: pointer;"/> 
				 			<f:setPropertyActionListener target="#{CargoMB.cargoSelecionado}" value="#{cargo}" /> 
				 		</h:commandLink> 
					</h:column>
					
					<h:column>
						<h:commandLink id="btnRemover" action="#{CargoMB.remover}"> 
				 			<h:graphicImage url="../resources/img/delete.gif" style="border: 0px; Cargor: pointer;"/> 
				 			<f:setPropertyActionListener target="#{CargoMB.cargoSelecionado}" value="#{cargo}" /> 
				 		</h:commandLink> 
					</h:column>
				    
				</h:dataTable>
				
			</h:column>
			<h:column></h:column>
		
		</h:panelGrid>
		
		
	</h:form>
	
</body>
</f:view>
</html>