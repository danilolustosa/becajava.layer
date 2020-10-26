package service;

import model.Cliente;
import repository.ClienteRepository;

public class ClienteService {
	
	public Cliente GetCliente(int indice) {		
		ClienteRepository repository = new ClienteRepository();		
		Cliente result = repository.GetCliente(indice);		
		
		result.Imc = result.Peso / (result.Altura * result.Altura);		
		return result;		
	}
	
	public void SetCliente(Cliente cliente) {
		ClienteRepository repository = new ClienteRepository();
		
		cliente.Imc = cliente.Peso / (cliente.Altura * cliente.Altura);	
		
		
		repository.SetCliente(cliente);
	}

}
