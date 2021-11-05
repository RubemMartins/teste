programa
{
	
	funcao inicio()
	{	
	// Declaração de variáveis Reais
		real n1, n2, n3, n4

	//Recebimento das variáveis n1, n2, n3, n4
		escreva("Digite um valor para o primeiro numero: ")
		leia(n1)

		escreva("Digite um valor para o segundo numero: ")
		leia(n2)

		escreva("Digite um valor para o terceiro numero: ")
		leia(n3)

		escreva("Digite um valor para o quarto numero: ")
		leia(n4)

		n1 = n1*n1
		n2 = n2*n2
		n3 = n3*n3
		n4 = n4*n4

		se(n3 >= 1000){
		escreva(" n3: "+n3+" .")
		}
		senao {
		escreva (" n1: "+n1+" n2: "+n2+" n3: "+n3+" n4: "+n4+" .")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */