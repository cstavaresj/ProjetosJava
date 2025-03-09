<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>

<html>

<f:view locale="#{ClienteMB.idioma}">	

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="../resources/css/estilo.css" type="text/css" rel="stylesheet"/>
	<f:loadBundle var="bundle" basename="bundle.Idioma" />
	<title><h:outputText value="#{bundle.TIT_ConsultarCliente}"/></title>
	<script type="text/javascript">
		statusListener = function(selectObj){
			alert('Alterado.');
		};
	</script>
</head>
	
<body>
	<h:form> <!-- Menu -->
		<rich:toolBar>
			<rich:dropDownMenu> <!-- Home -->
				<f:facet name="label">
					<h:panelGrid cellpadding="0" cellspacing="0" columns="2" style="vertical-align:middle">
                    	<h:outputLink value="menu.jsf">
							<h:graphicImage id="imgBtnNovo" url="../resources/img/home.png" style="height:20px; width:20px; border: 0px; Cargor: pointer;"/>
						</h:outputLink> 
                    </h:panelGrid>						
				</f:facet>
			</rich:dropDownMenu>
					
			<rich:dropDownMenu> <!-- Aba Cliente -->
				<f:facet name="label">
					<h:outputText value="#{bundle.MENU_Cliente}" />
				</f:facet>
						
				<rich:menuItem action="#{MenuMB.cadastrarCliente}">
					<h:outputText value="#{bundle.MENU_CadastrarCliente}"/>
				</rich:menuItem>
						
				<rich:menuItem action="#{MenuMB.consultarCliente}">
					<h:outputText value="#{bundle.MENU_ConsultarCliente}"/>
				</rich:menuItem>
			</rich:dropDownMenu>
					
			<rich:dropDownMenu> <!-- Aba Fornecedor -->
				<f:facet name="label">
					<h:outputText value="#{bundle.MENU_Fornecedor}" />
				</f:facet>
				
				<rich:menuItem action="#{MenuMB.cadastrarFornecedor}">
					<h:outputText value="#{bundle.MENU_CadastrarFornecedor}"/>
				</rich:menuItem>
						
				<rich:menuItem action="#{MenuMB.consultarFornecedor}">
					<h:outputText value="#{bundle.MENU_ConsultarFornecedor}"/>
				</rich:menuItem>
			</rich:dropDownMenu>
		</rich:toolBar>
	</h:form> <!-- Fim do Menu -->
			
	<h:form id="formConsultarCliente"> <!-- Início da página -->
	
		<!-- Tabela de consulta do Banco de Dados -->
		<h:dataTable id="ClientesEncontrados" value="#{ClienteMB.clientes}" var="cliente" rowClasses="linhaPar, linhaImpar" width="100%">
			<h:column>
				<f:facet name="header" > 
					<h:outputText value="#{bundle.COL_Codigo}"/> 
				</f:facet>
				<center><h:outputText value="#{cliente.codigo}" /></center> 
			</h:column>
					
			<h:column>
				<f:facet name="header"> 
					<h:outputText value="#{bundle.COL_Nome}" /> 
				</f:facet>
				<center><h:outputText value="#{cliente.nome}" /></center> 
			</h:column>
				
			<h:column>
				<f:facet name="header"> 
					<h:outputText value="#{bundle.COL_Sexo}" /> 
				</f:facet>		
				<center><h:outputText value="#{cliente.status}" /></center>
			</h:column>
			
			<h:column>
				<f:facet name="header"> 
					<h:outputText value="#{bundle.COL_Nascimento}" /> 
				</f:facet>
				<center><h:outputText value="#{cliente.nascimento}" /></center>				
			</h:column>
			
			<h:column>
				<f:facet name="header"> 
					<h:outputText value="#{bundle.COL_Cpf}" /> 
				</f:facet>
				<center><h:outputText value="#{cliente.cpf}" /></center> 
			</h:column>
			
			<h:column>
				<f:facet name="header"> 
					<h:outputText value="#{bundle.COL_Email}" /> 
				</f:facet>
				<center><h:outputText value="#{cliente.email}" /></center> 
			</h:column>
			
			<h:column>
				<f:facet name="header"> 
					<h:outputText value="#{bundle.COL_Telefone}" /> 
				</f:facet>
				<center><h:outputText value="#{cliente.telefone}" /></center> 
			</h:column>
			
			<h:column>
				<f:facet name="header"> 
					<h:outputText value="#{bundle.COL_Endereco}" /> 
				</f:facet>
				<center><h:outputText value="#{cliente.endereco}" /></center> 
			</h:column>
					
			<h:column>
				<center>	
				<h:commandLink id="btnEditar" action="#{ClienteMB.exibirParaEdicao}"> 
					<h:graphicImage url="../resources/img/edit.gif" style="border: 0px; Cargor: pointer;"/> 
				 	<f:setPropertyActionListener target="#{ClienteMB.clienteSelecionado}" value="#{cliente}" /> 
				 </h:commandLink>
				 </center> 
			</h:column>
					
			<h:column>
				<center>
				<h:commandLink id="btnRemover" action="#{ClienteMB.remover}"> 
					<h:graphicImage url="../resources/img/delete.gif" style="border: 0px; Cargor: pointer;"/> 
				 	<f:setPropertyActionListener target="#{ClienteMB.clienteSelecionado}" value="#{cliente}" /> 
				 </h:commandLink>
				 </center>
			</h:column>
		</h:dataTable>
	
	
		<!-- Formulário para pesquisar ou editar -->
		<h:panelGrid columns="3" columnClasses="col_esquerda, col_meio, col_direita" width="100%">
			<h:column></h:column>
			<h:column>
				<h:panelGrid columns="2">
			 		<h:commandLink id="btnSalvar" action="#{ClienteMB.salvaOuEdita}" >  
			 			<h:graphicImage id="imgBtnSalvar" url="../resources/img/save.gif" style="border: 0px; Cargor: pointer;"/>
			 			<h:outputLabel for="imgBtnSalvar" value="#{bundle.BTN_Salvar}" style="Cargor: pointer;"/> 
			 		</h:commandLink>		 		
			 		<h:commandLink id="btnPesquisar" action="#{ClienteMB.pesquisar}" >  
			 			<h:graphicImage id="imgBtnPesquisar" url="../resources/img/find.gif" style="border: 0px; Cargor: pointer;"/>
			 			<h:outputLabel for="imgBtnPesquisar" value="#{bundle.BTN_Pesquisar}" style="Cargor: pointer;"/> 
			 		</h:commandLink>			 		
				</h:panelGrid>	
				
				<rich:panel>
					<f:facet name="header">
           				<h:outputText value="#{bundle.TIT_ConsultarCliente}" />
        			</f:facet>
        			<a4j:queue requestDelay="#{queueBean.requestDelay}" ignoreDupResponses="#{queueBean.ignoreDupResponces}" />
        			<h:form id="form">
            			<h:panelGrid id="panelMsg" style="height:55px;" >
							<h:messages id="mensagem" errorClass="mensagemErro" warnClass="mensagemSuccess" infoClass="mensagemInfo"/>
						</h:panelGrid>
						<h:panelGrid id="campos" columns="2" columnClasses="col_label, col_input" width="80%">
							<h:column />
							<h:inputHidden value="#{ClienteMB.cliente.codigo}" />
							<h:outputLabel value="#{bundle.LBL_Nome}" />
							<h:inputText value="#{ClienteMB.cliente.nome}" style="width: 100%;"/>
							<h:outputLabel value="#{bundle.LBL_Sexo}" />
							<h:selectOneRadio value="#{ClienteMB.cliente.sexo}">
								<f:selectItem itemLabel="#{bundle.Masculino}" itemValue="true"/>
								<f:selectItem itemLabel="#{bundle.Feminino}" itemValue="false"/>
							</h:selectOneRadio>
							
							
							<h:outputLabel value="#{bundle.LBL_Nascimento}" />
							<rich:calendar value="#{ClienteMB.cliente.nascimento}" datePattern="dd/MM/yyyy" enableManualInput="true" />
							
							<h:outputLabel value="#{bundle.LBL_Cpf}" />
							<h:inputText value="#{ClienteMB.cliente.cpf}" style="width: 20%;"/>
							
							<h:outputLabel value="#{bundle.LBL_Email}" />
							<h:inputText value="#{ClienteMB.cliente.email}" style="width: 20%;"/>
							
							<h:outputLabel value="#{bundle.LBL_Telefone}" />
							<h:inputText value="#{ClienteMB.cliente.telefone}" style="width: 20%;"/>
							
							<h:outputLabel value="#{bundle.LBL_Endereco}" />
							<h:inputTextarea value="#{ClienteMB.cliente.endereco}" label="Endereco" rows="3" cols="50">
                        		<f:validateLength maximum="100" />
                    		</h:inputTextarea>
						</h:panelGrid>
        			</h:form>
				</rich:panel>
			</h:column>
			<h:column></h:column>
		</h:panelGrid>		
			
			<!-- Rodapé -->
		<center>
		<br>
		<small><h:outputText value="#{bundle.TXT_Idioma}" /></small> <br>
			<h:panelGrid id="idiomas" columns="3">
				<h:commandLink id="btnBrasil" action="#{ClienteMB.idiomaPortugues}" >  
			 		<h:graphicImage id="imgBtnBrasil" url="../resources/img/bandeira_brasil.gif" style="border: 0px; Cursor: pointer;"/>
		 		</h:commandLink>
		 		<h:column/>
		 		<h:commandLink id="btnEua" action="#{ClienteMB.idiomaIngles}">  
		 			<h:graphicImage id="imgBtnEua" url="../resources/img/bandeira_eua.gif" style="border: 0px; Cursor: pointer;"/>
		 		</h:commandLink>
			</h:panelGrid>
		</center>
		<!-- Fim do Rodapé -->
	</h:form> <!-- Fim da página -->
</body>
</f:view>
</html>