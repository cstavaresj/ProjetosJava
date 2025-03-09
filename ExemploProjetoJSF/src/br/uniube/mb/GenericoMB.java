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

/**
 * @author Luciene Chagas de Oliveira
 * @since 23/07/2010
 */
public class GenericoMB  {

	private static final long serialVersionUID = -2525649277419348761L;
	
	StringBuilder idioma = new StringBuilder("pt_BR");
	//private ITreinamentoFacade treinamentoFacade;
	private ResourceBundle bundle;
	private Logger logger;

	
	public GenericoMB() {
		
		//setTreinamentoFacade(new TreinamentoFacade());
		setLogger(Logger.getLogger(GenericoMB.class));
	}

	/**
	 * Seta o idioma padrao para ingles.
	 * 
	 * @author luciene
	 */
	public void idiomaIngles() {
		
		alterarIdioma("en");
	}
	
	/**
	 * Seta o idioma padrao para portugues.
	 * 
	 * @author luciene
	 */
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

	/**
	 * Formata a mensagem colocando os paramtros, caso exista.
	 * 
	 * @author luciene
	 * @param msg
	 * @param parametros
	 * @return {@link String}
	 */
	private String formatarMensagem(String msg, Object... parametros) {

		MessageFormat formatter = new MessageFormat("");
		formatter.applyPattern(msg);
		return formatter.format(parametros);

	}

	/**
	 * Retorna a diferenca, em milisegundos, entre as duas datas passadas como parametro.
	 * 
	 * @author luciene
	 * @param data1
	 * @param data2
	 * @return {@link Long}
	 */
	public long diferencaEmMilisegundos(Date data1, Date data2) {
		
		Calendar dt1 = Calendar.getInstance();
		dt1.setTime(data1);
		
		Calendar dt2 = Calendar.getInstance();
		dt2.setTime(data2);
		
		long diferencaEmMilisegundos = dt2.getTimeInMillis() - dt1.getTimeInMillis();
		//long diferencaEmDias = diferencaEmMilisegundos / (24 * 60 * 60 * 1000);
		
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
	
	
//	GETTERS AND SETTERS
	/*public ITreinamentoFacade getTreinamentoFacade() {
		return treinamentoFacade;
	}

	public void setTreinamentoFacade(ITreinamentoFacade treinamentoFacade) {
		this.treinamentoFacade = treinamentoFacade;
	}*/

}
