programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, x2, y1, y2, D
		
		escreva("Digite um valor para X1: ")
		leia (x1)

		escreva("Digite um valor para X2: ")
		leia (x2)

		escreva("Digite um valor para Y1: ")
		leia (y1)

		escreva("Digite um valor para Y2: ")
		leia (y2)

		D=mat.raiz( (mat.potencia((x1-x2),2.0) + mat.potencia((y1-y2),2.0) ),2.0)

		escreva("A distância entre os dois pontos é: "+D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */