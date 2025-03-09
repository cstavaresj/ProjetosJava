package br.uniube.mb;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class GenericoMB  {

	private static final long serialVersionUID = -2525649277419348761L;
	
	StringBuilder idioma = new StringBuilder("pt_BR");
	private ResourceBundle bundle;
	private Logger logger;

	public GenericoMB() {
		setLogger(Logger.getLogger(GenericoMB.class));
	}

	public void idiomaIngles() {		
		alterarIdioma("en");
	}
	
	public void idiomaPortugues() {	
		alterarIdioma("pt");
	}
	
	public void msgInfo(String keyBundle, Object... parametros) {
		// PEGA MENSAGEM NO BUNDLE
		String msg = formatarMensagem(getBundle().getString(keyBundle), parametros);
		// REGISTRA MENSAGEM NO LOG
		getLogger().info(msg);
		// EXIBE MENSAGEM PARA O USUARIO NA TELA
		getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null));
	}

	public void msgSuccess(String keyBundle, Object... parametros) {
		// PEGA MENSAGEM NO BUNDLE
		String msg = formatarMensagem(getBundle().getString(keyBundle), parametros);
		// REGISTRA MENSAGEM NO LOG
		getLogger().info(msg);
		// EXIBE MENSAGEM PARA O USUARIO NA TELA
		getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, msg, null));
	}

	public void msgError(String keyBundle, Object... parametros) {
		// PEGA MENSAGEM NO BUNDLE
		String msg = formatarMensagem(getBundle().getString(keyBundle), parametros);
		// REGISTRA MENSAGEM NO LOG
		getLogger().info(msg);
		// EXIBE MENSAGEM PARA O USUARIO NA TELA
		getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null));
	}

	private String formatarMensagem(String msg, Object... parametros) {
		
		MessageFormat formatter = new MessageFormat("");
		formatter.applyPattern(msg);
		return formatter.format(parametros);
	}

	public long diferencaEmMilisegundos(Date data1, Date data2) {
		
		Calendar dt1 = Calendar.getInstance();
		dt1.setTime(data1);
		
		Calendar dt2 = Calendar.getInstance();
		dt2.setTime(data2);
		
		long diferencaEmMilisegundos = dt2.getTimeInMillis() - dt1.getTimeInMillis();
		return diferencaEmMilisegundos;
	}

	public FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	
	public ResourceBundle getBundle() {
		return bundle;
	}
	
	public ResourceBundle getBundle(String bundleName) {
		Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
		return getBundle(bundleName, locale);
	}
	
	public ResourceBundle getBundle(String bundleName, Locale locale) {
		return ResourceBundle.getBundle(bundleName, locale);
	}
	
	public void setBundle(ResourceBundle bundle) {
		this.bundle = bundle;
	}
	
	public HttpServletRequest getHttpServletRequest(){
		return (HttpServletRequest) getExternalContext().getRequest();
	}
	
	public HttpServletResponse getHttpServletResponse(){
		return (HttpServletResponse) getExternalContext().getResponse();
	}
	
	public ExternalContext getExternalContext() {
		return getFacesContext().getExternalContext();
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	public Logger getLogger() {
		return logger;
	}

	public void alterarIdioma(String novoIdioma) {

		idioma.delete(0, idioma.length());
		idioma.append(novoIdioma);
		getFacesContext().getViewRoot().setLocale(new Locale(novoIdioma));
	}
	
	public String getIdioma() {
		return idioma.toString();
	}
}