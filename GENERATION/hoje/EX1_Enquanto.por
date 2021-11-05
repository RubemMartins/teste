programa
{
	
	funcao inicio()
	{
	
		real media = 0.0, x2 = 0.0
		inteiro somatorio = 0, somaf = 0, num = 0 , x = 0
		
		enquanto(num>=0){

			escreva("Digite um numero: ")
			leia(num)

			se(num>=0){
			somatorio = num + somatorio

			x2 = x2 + 1

			media = somatorio/x2
			}
		}
		escreva("Soma de todos os numeros digitados: "+ somatorio + " media: "+media+" quantidade de numeros lidos: "+x2)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */