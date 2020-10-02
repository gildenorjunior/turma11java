programa
{

	/*EXERCICIO 01
	 * 
	 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento 
	 * do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
	 * João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
	 * Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
	 * Caso contrário mostrar tais variáveis com o conteúdo ZERO.
	 * 
	 * 
	 * leia a varival p (peso dos tomates) e verifique se há excesso
	 * se sim, grave na variavel e (excesso). E na variavel m(multa) o valor da multa que ele ira pagar
	 * se nao, mostre as variaveis com o conteudo zero
	 * 
	 */

	
	funcao inicio()
	{
		real peso = 0, excesso = 0, multa =0

		escreva("Qual o peso dos tomates? ")
		leia(peso)
		limpa()

		se (peso <= 50) 
		{
			escreva("Está dentro do peso estabelecido!\n")
			escreva("O excesso de peso foi de: ", excesso, " kilos e a multa de: ", multa, " reais")
		}
		senao se(peso > 50)
		{
			escreva("O peso excedeu o limite, você deverá pagar uma multa de 4 reais para cada kilo excedente. ")
			escreva("\n")
			excesso = (peso - 50)
			multa = ((excesso) * 4)
			escreva("Você excedeu em ", excesso, " kilos e deverá pagar ", multa, " reais em multa.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 866; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */