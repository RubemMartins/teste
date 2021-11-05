programa
{
	
	funcao inicio()
	{	
	// Declaração de variáveis Reais
		inteiro C, N=0, E=0
		
		//Recebimento do código do funcionário, valor entre 1 e 100
		escreva("Digite seu código de funcionário: ")
		leia(C)
		
		se(C>=1 e C<=100){
			
		escreva("Digite sua quantidade de horas trabalhadas: ")
		leia(N)
		}
		se(N<=50 e N>0){
			escreva ("Seu salário é "+N*10+" $.")
		}
		se (N>50){
			E = (N-50)*20	
			escreva ("Seu salário é 500 $, com excedente de: " + E + " $")
		}
		se(C<1 ou C>100){
		escreva("Código de funcionário invalido.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 233; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */