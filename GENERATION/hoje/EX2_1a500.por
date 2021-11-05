programa {
	
	funcao inicio() {

		//Laço de Repetição ---> Para - For
		inteiro num = 0, cont, maior = 0, soma = 0

		//(inicialização;condição;incremento ou decremento)
		para(cont = 1; cont <= 500; cont++)
		
		{
			
			num = num + 1

			se(num % 2 !=0 e num % 3 == 0){
				
				maior = num + soma
				soma = maior
			}
		}
		escreva("\nA soma dos numeros impares diviseis por 3 não pares de 1 a 500 é = ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */