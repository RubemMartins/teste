programa
{
	
	funcao inicio()
	{
		inteiro n
		escreva("Digite um numero inteiro: ")
		leia(n)

		se(n>0 e n%2==0){

		escreva("O numero digitado é positivo e par")
	
		}
		senao se(n<0 e n%2==0){

		escreva("O numero digitado é negativo e par")
	
		}
		senao se(n>0 e n%2!=0){

		escreva("O numero digitado é positivo e ímpar")
	
		}
		senao se(n<0 e n%2!=0){

		escreva("O numero digitado é negativo e ímpar")
	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */