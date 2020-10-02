programa
{
	
	funcao inicio()
	{
		/*
		 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
		 * 
		 */

		inteiro a = 0, b = 0, c = 0, d = 0, ee = 0 , f = 0, x = 0, y = 0

		escreva("Digite o primeiro valor: ")
		leia(a)

		escreva("Digite o segundo valor: ")
		leia(b)

		escreva("Digite o terceiro valor: ")
		leia(c)

		escreva("Digite o quarto valor: ")
		leia(d)

		escreva("Digite o quinto valor: ")
		leia(ee)

		escreva("Digite o sexto valor: ")
		leia(f)

		x = (((c * ee) - (b * f)) / ((a * ee) - (b * d)))

		y = (((a * f) - (c * d)) / ((a * ee) - (b * d)))

		escreva("Os valores calculados para X e Y foram: \n")
		escreva("Para X: ", x)
		escreva("\nPara Y: ", y)
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */