programa
{
	
	funcao inicio()
	{	
		real sal, nf, per100 = 0, x, medsal = 0, mdf = 0, maiorsal=0, percem = 0
		inteiro somasal = 0, somaf = 0, hab

		para(hab=1; hab<=20 ; hab++){
			
			escreva("Digite o seu salário: ")
			leia(sal)

			escreva("Digite o numero de filhos: ")
			leia(nf)

			somasal = sal + somasal

			somaf = nf + somaf

			medsal = somasal/hab

			mdf = somaf/hab

			se (sal > maiorsal){
				maiorsal = sal
			}

			se (sal < 100){
				per100 = per100+1
				percem = (per100/hab)*100
			}

		}
		escreva("Media de filhos: "+ mdf + " media sal: "+medsal+" percem: "+percem+" maiorsal: "+maiorsal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */