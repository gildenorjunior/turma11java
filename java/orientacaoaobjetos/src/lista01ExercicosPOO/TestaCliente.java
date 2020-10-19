package lista01ExercicosPOO;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.id = 001;
		cliente1.nome = "José";
		cliente1.idade = 35;
		cliente1.sexo = 'M';
		
		System.out.println("Nome do cliente: " + cliente1.nome);
		System.out.println("Id do cliente: " + cliente1.id);
		System.out.println("Idade do cliente: " + cliente1.idade);
		System.out.println("Sexo do cliente: " + cliente1.sexo);
		System.out.println();	
		System.out.println("Valor a ser pago pelo cliente: " + cliente1.pagar(100));
		
	}

}
