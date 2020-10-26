package repository;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteRepository {
	
	public List<Cliente> Lista = new ArrayList<Cliente>();
	
	
	public Cliente GetCliente() {
		
		Cliente cliente = new Cliente();
		
		cliente.Nome = "Maria";
		cliente.Idade = 14;
		cliente.Peso = 56;
		cliente.Altura = 1.70;		
		
		return cliente;
	}
	
	
	public void SetCliente(Cliente cliente) {
		Lista.add(cliente);
	}

}
