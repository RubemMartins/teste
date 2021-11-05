programa
{
	
	funcao inicio()
	{
	
		real notas[5]

		real soma = 0.0, media = 0.0

		inteiro i
		
		escreva("Digite às quatro notas do Aluno: \n")
		
		para(i = 0; i <= 4; i++) {
			escreva(i+1+"º pontuação: ")
			leia(notas[i])

			se(notas[i] > soma){
			soma = notas[i]
			}
		}
		
		escreva(" O maior valor é: "+soma)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */