// Funções JavaScript

// Função JavaScript para validação de campos obrigatórios na página de alteração
function funValidaCampos()
{
	// retorna cada campo. A função getElementsByName retorna um vetor de todos os elementos que possui o nome especificado. 
	nome = window.document.getElementsByName("cliente.nome")[0];
	nascimento = window.document.getElementsByName("cliente.nascimento")[0];
	cpf = window.document.getElementsByName("cliente.cpf")[0];
	endereco = window.document.getElementsByName("cliente.endereco")[0];
	telefone = window.document.getElementsByName("cliente.telefone")[0];
	email = window.document.getElementsByName("cliente.email")[0];
	
	if (nome.value.length <= 0) {
		alert("Favor informar o campo nome do cliente!");
		nome.focus();
		return false;	
	} else if (nascimento.value.length <= 0) {
		alert("Favor informar o campo data de nascimento do cliente!");
		descricao.focus();
		return false;
	} 
	else if (cpf.value.length <= 0) {
		alert("Favor informar o campo cpf do cliente!");
		preco.focus();
		return false;
	}
	else if (endereco.value.length <= 0) {
		alert("Favor informar o campo endereço do cliente!");
		preco.focus();
		return false;
	}
	else if (telefone.value.length <= 0) {
		alert("Favor informar o campo telefone do cliente!");
		preco.focus();
		return false;
	}
	else if (email.value.length <= 0) {
		alert("Favor informar o campo email do cliente!");
		preco.focus();
		return false;
	}
	return true;
}