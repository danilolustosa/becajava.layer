package layer;

import java.util.Scanner;

import model.Cliente;
import service.ClienteService;

public class Main {

	public static void main(String[] args) {
		
		ClienteService clienteService = new ClienteService();
		Scanner leitor = new Scanner(System.in);
		
		//Salvando um novo cliente
//		Cliente newCliente = new Cliente();
//		newCliente.Altura = 1.92;
//		newCliente.Peso = 91;
//		newCliente.Idade = 36;
//		newCliente.Nome = "Danilo";
//		clienteService.SetCliente(newCliente);
		
		
		//Obtendo e imprimindo um cliente específico
		System.out.println("Digite a posição do cliente que você gostaria de obter:");
		Cliente cliente = clienteService.GetCliente(leitor.nextInt());		
		System.out.println("Nome: " + cliente.Nome + " ----  Idade: " + cliente.Idade + " ------ IMC: " + cliente.Imc);
		
		
		leitor.close();
	}

}
