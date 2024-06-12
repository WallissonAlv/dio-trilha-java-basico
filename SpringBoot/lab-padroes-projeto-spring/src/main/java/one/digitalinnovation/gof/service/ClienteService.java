package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/*
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * Isso, se necessario, podemos ter multiplas implementações dessa mesma interface :D
 * 
 * @author WallissonAlv
 * */

public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir (Cliente cliente);
	
	void atualizar (Long id, Cliente cliente);
	
	void excluir (long id);
	
}
