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
	<title><h:outputText value="#{bundle.TIT_Inicio}"/></title>
	<script type="text/javascript">
		statusListener = function(selectObj){
			alert('Alterado.');
		};
	</script>
</head>
	
<body>
			<h:form> <!-- Menu -->
				<rich:toolBar>
				  	<rich:dropDownMenu>
						<f:facet name="label">
							<h:panelGrid cellpadding="0" cellspacing="0" columns="2" style="vertical-align:middle">
                   		 		<h:outputLink value="menu.jsf">
									<h:graphicImage id="imgBtnHome" url="../resources/img/home.png" style="height:20px; width:20px; border: 0px; Cargor: pointer;"/>
								</h:outputLink> 
							</h:panelGrid>						
						</f:facet>
					</rich:dropDownMenu>
					
					<rich:dropDownMenu>
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
					
					<rich:dropDownMenu>
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
			
		<h:form>
			<center>
			<br>
			<p><h:outputText value="#{bundle.TXT_Inicio}" /></p>
			<br>
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
		</h:form>
</body>
</f:view>
</html>