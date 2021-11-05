programa
{
	
	funcao inicio()
	{
		real N1[3][3],N2[3][3], soma = 0.0, somad = 0.0

		para(inteiro l = 0; l < 3; l++){
			
			para(inteiro c = 0; c < 3; c++){
				
			escreva("Digete um valor para Matriz N1: ")
			leia(N1[l][c]) // --> input da Matriz

			soma = N1[l][c]+soma

			se (l+c==0 ou (l == 1  e c == 1) ou (l == 2 e c == 2) ){

				somad = N1[l][c]+somad
				
			}
			
			}
		}
		escreva("A soma total da matriz é: "+soma+"A soma da diagonal principal é: "+somad)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 6, 7, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */