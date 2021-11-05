programa
{
	
	funcao inicio()
	{
		inteiro notas[4][4] = {{1,2,3,4},//--> linha[0]
						   {1,2,3,4},//--> linha[1]
						   {1,2,3,4},//--> linha[2]
						   {1,2,3,4}}//--> linha[3]

		para(inteiro linha = 0; linha <= 3; linha++){
			para(inteiro coluna = 0; coluna <= 3; coluna++){

			escreva(notas[linha][coluna], ", ")
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
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */