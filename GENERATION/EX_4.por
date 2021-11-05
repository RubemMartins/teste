programa
{
		//Incluido biblioteca Matematica e a chamando de mat-
		inclua biblioteca Matematica --> mat
	funcao inicio()
	{	
		//Declaração de variáveis como valores inteiros
		real A, B, C, R, S, D

		//Solicitação de valor para A , B , C
		
		escreva("Digite um valor para A: ")
		leia(A)
		
		escreva("Digite um valor para B: ")
		leia(B)
		
		escreva("Digite um valor para C: ")
		leia(C)

		R = mat.potencia((A + B),2.0)
		
		S = mat.potencia((B + C),2.0)

		D = (R+S)/2
 
		escreva(" R = "+ R + " S = " + S + " D = " + D )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */