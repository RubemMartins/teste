programa
{
	
	funcao inicio()
	{
		real N1[4][6],N2[4][6], M1[4][6],M2[4][6] 

		para(inteiro l = 0; l < 4; l++){
			
			para(inteiro c = 0; c < 6; c++){
				
			escreva("Digete o "+(c+1)+" º valor para Matriz N1: ")
			leia(N1[l][c]) // --> input da Matriz
			
			escreva("Digete o "+(c+1)+" º valor para Matriz N2: ")
			leia(N2[l][c])

			M1[l][c] = N1[l][c]+N2[l][c]

			M2[l][c] = N1[l][c]-N2[l][c]
			
			}
			}
		para(inteiro l = 0; l < 4; l++){
			
			para(inteiro c = 0; c < 6; c++){
 
			escreva(M1[l][c], ", ", M2[l][c], ", ")// --> Mostra os valores da Matriz
			}
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 485; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 6, 7, 2}-{M1, 6, 26, 2}-{M2, 6, 35, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */