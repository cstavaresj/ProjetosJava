<h:form>
	<rich:toolBar style="height: 40px"> <!-- MENU -->
		<rich:dropDownMenu> <!-- ÍCONE INICIO -->
			<f:facet name="label">
				<h:panelGrid>
                	<h:outputLink value="inicio.jsf">
						<h:graphicImage id="imgBtnHome" url="../resources/img/home.png" style="height:25px; width:25px"/>
					</h:outputLink> 
				</h:panelGrid>						
			</f:facet>
		</rich:dropDownMenu>
		
		<rich:dropDownMenu> <!-- ABA VíRUS -->
			<f:facet name="label">
				<h:outputText value="#{bundle.MENU_Virus}" style="font-size: 25px"/>
			</f:facet>
			<rich:menuItem value="#{bundle.MENU_Cadastrar}" action="#{MenuMB.cadastrarVirus}" style="font-size: 20px" />
			<rich:menuItem value="#{bundle.MENU_Consultar}" action="#{MenuMB.consultarVirus}" style="font-size: 20px" />
		</rich:dropDownMenu>
		
		<rich:dropDownMenu> <!-- ABA DOENÇA -->
			<f:facet name="label">
				<h:outputText value="#{bundle.MENU_Doenca}" style="font-size: 25px"/>
			</f:facet>
			<rich:menuItem value="#{bundle.MENU_Cadastrar}" action="#{MenuMB.cadastrarDoenca}" style="font-size: 20px" />
			<rich:menuItem value="#{bundle.MENU_Consultar}" action="#{MenuMB.consultarDoenca}" style="font-size: 20px" />
		</rich:dropDownMenu>
	</rich:toolBar><!-- FIM DO MENU -->
	
	<center> <!-- OPÇÃO DE IDIOMAS -->
		<br>
		<h:panelGrid id="idiomas" columns="3">
			<h:commandLink id="btnBrasil" action="#{VirusMB.idiomaPortugues}" >  
				<h:graphicImage id="imgBtnBrasil" url="../resources/img/bandeira_brasil.gif" style="border: 0px; Cursor: pointer;"/>
		 	</h:commandLink>
		 	<h:column/>
		 	<h:commandLink id="btnEua" action="#{VirusMB.idiomaIngles}">  
		 		<h:graphicImage id="imgBtnEua" url="../resources/img/bandeira_eua.gif" style="border: 0px; Cursor: pointer;"/>
		 	</h:commandLink>
		</h:panelGrid>
		<small><h:outputText value="#{bundle.TXT_Idioma}" /></small>
	</center>
</h:form>