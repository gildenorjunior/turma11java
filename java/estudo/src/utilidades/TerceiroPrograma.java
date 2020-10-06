package utilidades;

public class TerceiroPrograma {

	public static void main(String[] args) {
		
		int valor = 10; //TIPO PRIMITIVO
		char opcao = 'X';
		String nome = "Gildenor"; //%s
		double salario = 1000.01; //%f
		float imposto = 1000.01f;
		
		System.out.println("EXEMPLO DO PRINT");
		System.out.println("Nome do usuario: " + nome + ", salario: " + salario);
		System.out.println("TESTE APÓS PRINT LN");
		System.out.printf("Nome do usuario: %s e salario: %.1f como acrescimo de 10%% por cento", nome, (salario + (salario*0.01)));


	}

}
