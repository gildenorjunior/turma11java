programa
{
	
	funcao inicio()
	{
		//pegar, receber, colher, do usuario o nome e mandar um mensagem de bom dia
		//colocando sr ou sra conforme a opção
		//ingredientes - variaveis
		//IDOSO ACIMA DE 60 ANOS (60 INCLUSIVE)
		//,MADURO ENTRE 25 E 59 ANOS
		//JOVEM ABAIXO DE 25


		cadeia nomeUsuario
		caracter opcao 
		inteiro anoNascimento
		inteiro idade
		escreva("Digite seu nome: ")
		leia(nomeUsuario)

		escreva("Digite (M) para masculino ou (F) para feminino: ")
		leia(opcao)

		escreva("Digite seu ano de nascimento: ")
		leia(anoNascimento)


		se (opcao == 'F')
		{
			escreva("Oi Senhora ", nomeUsuario, " ")	
		}
		senao se (opcao == 'f')
		{
			escreva("Oi Senhora ", nomeUsuario, " ")
		}
		senao se (opcao == 'M')
		{
			escreva("Oi Senhor ", nomeUsuario, " ")
		}
		senao se (opcao == 'm')
		{
			escreva("Oi Senhor ", nomeUsuario, " ")
		}
		senao 
		{
			escreva("Oi Senhorx, ", nomeUsuario, " ")
		}


		idade = (2020 - anoNascimento) //calcula a idade e armazena na variavel
			
		se ((idade) < 25)
		{
			escreva("você é jovem ainda!!!")
		}
		senao se (idade >= 25 e idade <= 59)
		{
			escreva("você está maduro(a)")
		}
		senao se(idade >= 60)
		{
			escreva("você está idoso(a)!")
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1212; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */