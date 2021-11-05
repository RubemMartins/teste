programa
{
	
	funcao inicio()
	{	
		real b, h,area
		
		escreva("Escreva um valor em cm para base do tringulo: ")
		leia(b)
		escreva("Escreva um valor em cm para altura do tringulo: ")
		leia(h)

		se ( b > 0 e h > 0){
			area = (b*h)/2
		escreva (" A area do triangulo é: "+area+" cm²")
			
		}
		senao {
		escreva("Digite uma valores para base e para altura acima de zero")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */