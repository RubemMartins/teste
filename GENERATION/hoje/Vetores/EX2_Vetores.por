programa
{
	inclua biblioteca Util --> u
	funcao inicio()
	{
		real somamed = 0.0, media = 0.0
		
		inteiro notas[10]

		inteiro soma = 0,  i, num 
		
		
		para(i = 0; i <= 9; i++) {
			
			num = u.sorteia (1, 6)
			
			notas[i]= num
			escreva("O "+(i+1)+"º é : "+num+"\n")
			
			somamed = num +somamed
			
			se(notas[i] >= 6){
			soma = soma+1
			}
		}
		media = somamed/i
		escreva(" O numero 6 foi sorteado : "+soma+" vezes, a média dos valores lançados é: "+media)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 146; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */