package layer;

import model.Cliente;
import service.ClienteService;

public class Main {

	public static void main(String[] args) {
		
		ClienteService clienteService = new ClienteService();
		
		
		//Salvando um novo cliente
		Cliente newCliente = new Cliente();
		newCliente.Altura = 1.92;
		newCliente.Peso = 91;
		newCliente.Idade = 36;
		newCliente.Nome = "Danilo";
		clienteService.SetCliente(newCliente);
		
		
		//Obtendo e imprimindo um cliente específico
		Cliente cliente = clienteService.GetCliente();		
		System.out.println("Nome: " + cliente.Nome + " ----  Idade: " + cliente.Idade + " ------ IMC: " + cliente.Imc);
	}

}
