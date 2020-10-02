programa
{
	//EXERCICIOS01 (ENQUANTO)
	//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente
	//no final o total do somatório, a média e o total de valores lidos. O programa deve fazer as
	//leituras dos valores enquanto o usuário estiver fornecendo valores positivos.
	//Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
	
	funcao inicio()
	{

		inteiro valorDigitado, totalSomatorio = 0, contador = 0

		escreva("Por favor, digite um número: ")
		leia(valorDigitado)
		
		enquanto(valorDigitado > 0)
		{	
			contador = contador + 1
			escreva("Por favor, digite um número: ")
			leia(valorDigitado)
			totalSomatorio = totalSomatorio + valorDigitado
			
		}
		
		limpa()
		escreva("Número digitado invalido!\n")
		escreva("A soma dos números digitados foi: ", totalSomatorio, "\n")
		escreva("A média dos valores digitados foi de ", (totalSomatorio / contador))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 718; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */