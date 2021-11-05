programa
{
	
	funcao inicio()
	{	
		real notas[4]

		real soma = 0.0, media = 0.0

		inteiro i
		
		escreva("Digite às quatro notas do Aluno: \n")
		
		para(i = 0; i <= 3; i++) {
			escreva(i+1+"º Nota: ")
			leia(notas[i])
			soma = soma + notas[i]
			media = soma/(i+1)
		}
		
		escreva(" A média do aluno é: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 6, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */