package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;

/*
 * Implementação da Strategy (ClienteService), a qual pode ser
 * injetada pelo Spring via(@Autowired).
 * 
 * @author WallissonAlv
 * */

@Service
public class ClienteServiceImpl implements ClienteService {

	//SINGLETON: Injetar componentes
	@Autowired
	private ClienteRepository clienteRepository;
	//STRATEGY
	@Autowired
	private EnderecoRepository enderecoRepository;
	//FACADE
	@Autowired
	private ViaCepService viaCepService;
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		// Buscar todos os clientes
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// Buscar clinte por ID
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		//Buscar cliente por ID, caso exista
		Optional<Cliente> clienteDb = clienteRepository.findById(id);
		if (clienteDb.isPresent()) {
			salvarClienteComCep(cliente);
		}
	}

	@Override
	public void excluir(long id) {
		clienteRepository.deleteById(id);
	}

	private void salvarClienteComCep(Cliente cliente) {
		// Verificar se o Endereco do cliente já existe pelo CEP
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			// caso não exista, puxar do ViaCEP
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return null;
		});
		cliente.setEndereco(endereco);
		// Inserir novo endereco do cliente
		clienteRepository.save(cliente);
	}
}
