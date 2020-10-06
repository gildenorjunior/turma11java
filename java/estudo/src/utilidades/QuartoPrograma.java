package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		
		//criando um teclado dentro do programa
		Scanner tec = new Scanner(System.in); //criou o teclado
		
		String nome;
		int anoNascimento;
		double salario;
		int idade;
		
		System.out.print("Digite seu nome: ");
		nome = tec.next();
		
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = tec.nextInt();
		
		System.out.print("Digite seu salario: ");
		salario = tec.nextDouble();
		
		idade = (2020 - anoNascimento);
		
		System.out.printf("Oi %s, sua idade é %d e seu salário R$%.2f", nome, idade, salario);
		
		tec.close();

	}

}
