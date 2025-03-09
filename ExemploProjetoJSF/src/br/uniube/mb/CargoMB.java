package br.uniube.mb;

import java.util.List;

import javax.xml.bind.ValidationException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import br.uniube.dao.CargoDAO;
import br.uniube.model.Cargo;

/**
 * Classe representando o Managed Bean para a tela de CRUD da entidade Cargo.
 * 
 * @author Luciene Chagas de Oliveira
 * 
 */

public class CargoMB extends GenericoMB {

	private static final long serialVersionUID = 8681338268167191368L;

	private Cargo cargo = new Cargo();
	private Cargo cargoSelecionado;
	private List<Cargo> cargos; // arraylist da consulta
	
	
	public CargoMB() {
		
		setLogger(Logger.getLogger(CargoMB.class));
		setBundle(super.getBundle("bundle.Exemplo"));
		novo();
		
	}
	
	/**
	 * Habilita a tela para o cadastro do novo Cargo.
	 * 
	 * @author luciene
	 */
	public void novo() {
		
		limpaCampos();
		
	}
	
	/**
	 * Salva o novo Cargo.
	 * 
	 * @author luciene
	 */
	public void salvar() {
		try {
			validaCampos();
			// chama o DAO para para fazer a inserção
			if (getCargo().getCodigo() == 0) getCargo().setCodigo(null); 
			CargoDAO dao = new CargoDAO();
			dao.salvaOuEdita(getCargo());
			limpaCampos();
			msgSuccess("MSG_CargoCadastrado");
			
		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoCadastrarCargo");
		}
		
	}
	
	/**
	 * Pesquisa os Cargos de acordo com os campos preenchidos.
	 * 
	 * @author luciene
	 */
	public void pesquisar() {

		try {
			
			CargoDAO dao = new CargoDAO();
			List<Cargo> listaCargos = dao.pesquisar(getCargo());
			setCargos(listaCargos);
			msgInfo("MSG_XCargosEncontrados", listaCargos.size());
			
		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarCargo");
		} 
		
	}
	
	/**
	 * Remove o Cargo selecionado.
	 * 
	 * @author luciene
	 */
	public void remover() {
		
		try {
			
			if (getCargoSelecionado() != null) { 
				
				// chama o DAO para para fazer a exclusão
				CargoDAO dao = new CargoDAO();
				Cargo cargoEncontrado = dao.buscaPorId(getCargoSelecionado().getCodigo());
				dao.remove(cargoEncontrado);
				setCargos(dao.buscaCargos());
				msgInfo("MSG_CargoRemovido");
				
			} else {
				msgError("MSG_NenhumCargoSelecionado");
			}
			
		} catch (Exception e) {
			msgError("MSG_FalhaAoRemoverCargo");
		}
		
	}
	
	/**
	 * Altera o Cargo selecionado.
	 * 
	 * @author luciene
	 */
	public void editar() {
		
		try {
			
			validaCampos();
			// chama o DAO para para fazer a alteração
			CargoDAO dao = new CargoDAO();
			dao.atualiza(getCargo());
			limpaCampos();
			msgSuccess("MSG_CargoAlterado");
			
		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoAlterarCargo");
		}
		
	}
	
	/**
	 * Exibe o Cargo selecionado para edicao.
	 * 
	 * @author luciene
	 */
	public void exibirParaEdicao() {
		
		if (getCargoSelecionado() != null) {
			
			setCargo(getCargoSelecionado());
			
		} else {
			msgError("MSG_NenhumCargoSelecionado");
		}
		
	}
	
	/**
	 * Limpa os campos da tela
	 * 
	 * @author luciene
	 */
	private void limpaCampos() {
		
		try {
			CargoDAO dao = new CargoDAO();
			List<Cargo> Cargos = dao.buscaCargos();
			setCargos(Cargos);
			
			Cargo Cargo = new Cargo();
			Cargo.setAtivo(true);
			setCargo(Cargo);
			
		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarCargo");
		} 
		
	}
	
	/**
	 * Valida os campos da tela, lancando uma {@link ValidationException} caso algo esteja errado.
	 * 
	 * @author luciene
	 * @throws ValidationException
	 */
	private void validaCampos() throws ValidationException {
		
		if (StringUtils.isEmpty(getCargo().getNome())) {
			
			throw new ValidationException("MSG_CampoNomeObrigatorio");
			
		} else if (getCargo().getAtivo() == null) {
			
			throw new ValidationException("MSG_CampoAtivoObrigatorio");
			
		}
		
	}
	
//	GETTERS AND SETTERS
	
	

	public List<Cargo> getCargos() {
		return cargos;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public void setCargos(List<Cargo> Cargos) {
		this.cargos = Cargos;
	}

	public Cargo getCargoSelecionado() {
		return cargoSelecionado;
	}

	public void setCargoSelecionado(Cargo CargoSelecionado) {
		this.cargoSelecionado = CargoSelecionado;
	}

}
