programa
{
	funcao inicio()
	{
		inteiro anos, meses, dias,final

		escreva("Digite sua idade atual, contabilizando anos meses e dias: ")
		escreva("\nanos: ")
		leia(anos)
		escreva("\nmeses: ")
		leia(meses)
		escreva("\ndias: ")
		leia(dias)

		//CÁCULO DE ANOS PARA DIAS
		anos = anos*365

		//CÁCULO DE MESES PARA DIAS
		meses = meses*30

		//CÁCULO DE SOMA FINAL
		final = anos+meses+dias

		escreva("Sua idade em dias equivale a: " + final + " dias.")
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */