package repository;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteRepository {
	
	public List<Cliente> Lista = new ArrayList<Cliente>();
	
	
	public Cliente GetCliente(int indice) {
		
		Cliente cliente = new Cliente();		
		cliente.Nome = "Maria";
		cliente.Idade = 14;
		cliente.Peso = 56;
		cliente.Altura = 1.70;
		Lista.add(cliente);
		
		cliente = new Cliente();		
		cliente.Nome = "Antônio";
		cliente.Idade = 18;
		cliente.Peso = 80;
		cliente.Altura = 1.90;
		Lista.add(cliente);
		
		cliente = new Cliente();		
		cliente.Nome = "José";
		cliente.Idade = 20;
		cliente.Peso = 90;
		cliente.Altura = 1.70;
		Lista.add(cliente);
		
		cliente = new Cliente();		
		cliente.Nome = "Silvio";
		cliente.Idade = 25;
		cliente.Peso = 85;
		cliente.Altura = 1.77;
		Lista.add(cliente);
		
		cliente = new Cliente();		
		cliente.Nome = "Stephanie";
		cliente.Idade = 22;
		cliente.Peso = 50;
		cliente.Altura = 1.70;
		Lista.add(cliente);
		
		return Lista.get(indice);
	}
	
	
	public void SetCliente(Cliente cliente) {
		Lista.add(cliente);
	}

}
