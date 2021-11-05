programa
{
	
	funcao inicio()
	{	// Declaração de variáveis Reais
		real P, M, E

		//Recebimento do peso dos tomates 
		escreva("Coloque os tomates sobre a balança: ")
		leia(P)

		se(P>50){
			E = (P - 50)
			M = E*4
			escreva ("Excesso de "+E+" kg e multa de "+M+" $.")
		}
		senao {
			escreva("E = 0, M = 0")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */