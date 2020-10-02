programa
{
	inclua biblioteca Util
	//EXERCICIO 01 (VETOR)
	//  Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
	//  e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	funcao inicio()
	{
		const inteiro LIMITE = 5
		inteiro valoresDado[LIMITE]
		
		escreva("A pontuação da atividade foi de: ", valoresDado[LIMITE])
		/*
		pula()
		para (inteiro x = 0 ; x < LIMITE; x++) {
			valoresDado[x] = Util.sorteia(1, 6)
		}
		para (inteiro x = 0; x < LIMITE; x++){
			escreva("O valor ",(x+1), " foi ",valoresDado[x])
			pula()
			
		}
		*/
		
	}
	
	funcao pula(){
		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */