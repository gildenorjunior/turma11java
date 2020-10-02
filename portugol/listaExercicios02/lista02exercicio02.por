programa
{

	/*EXERCICIO 02
	 * 
	 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas 
	 * de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
	 * caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
	 * No final do processamento imprimir o salário total e o salário excedente.
	 * 
	 */

	
	funcao inicio()
	{
		real codigoOperario = 0, numeroHorasTrabalhadas = 0, salarioTotal = 0, excedentes = 0, salarioExcedente = 0


		escreva("Digite seu código de funcionário: ")
		leia(codigoOperario)

		limpa()

		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(numeroHorasTrabalhadas)

		limpa()

		

		se (numeroHorasTrabalhadas > 50)
		{
			excedentes = (numeroHorasTrabalhadas - 50)
			salarioExcedente = (excedentes * 20)
			salarioTotal = (50 * 10)
			escreva("Você excedeu seu horario de trabalho em ", excedentes, " horas. \n")
			escreva("Você irá receber de salário total ", salarioTotal, " reais e de salário excedente ", salarioExcedente, " reais.")
		}
		senao 
		{
			salarioTotal = (numeroHorasTrabalhadas * 10)
			escreva("Você não excedeu o limite de horas trabalhadas, seu total de horas foram ", numeroHorasTrabalhadas, " horas. \n")
			escreva("Você irá receber de salário total ", salarioTotal, " reais e de salário excedente ", salarioExcedente, " reais.")
		}
		
	}	

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 944; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */