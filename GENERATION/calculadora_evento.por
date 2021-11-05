programa
{
	
	funcao inicio()
	{
	inteiro evento, horas, minutos, segundos, resto, resto2
		escreva("digite o tempo de duração de um evento em segundos: ")
		leia(evento)

		horas = evento/3600
		resto = evento%3600
		minutos = resto/60
		segundos = (evento%3600)%60

		escreva("o eventou durou," + horas + " hora(s)," + minutos + " minuto(s) e " + segundos + " segundo(s).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 164; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */