programa
{

	funcao inicio()
	{
		inteiro anos, meses,final,resto,dias,resto10

		escreva("Digite sua idade atual, expressa em dias: ")
		escreva("\ndias: ")
		leia(dias)

		//CÁCULO DE DIAS PARA ANOS
		anos = dias/365
	
		//CÁCULO DE DIAS PARA MESES
		resto = dias%365
		meses = resto/30
		
		//CÁCULO DO RESTANTE DOS DIAS
		dias = (dias%365)%30

		escreva("\nSua idade equivale a: " + anos + " anos, " + meses + " meses e " + dias + " dias.")
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */