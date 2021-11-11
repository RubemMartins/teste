package br.com.generation.ExerciciosFor;

import java.util.Scanner;

public class Exercicio4While {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int idade, nervmaisquarenta = 0 , calmo = 0, start = 1, mnervosa =0 , sexo, hagressivo = 0, psic, ocalmo = 0, calmmdezoito = 0;
		
		while(start <= 150) {
			
			System.out.println("Qual é sua idade em anos: ");
			idade = in.nextInt();	
			
			System.out.println("Sexo(1-feminino, 2-masculino, 3-Outros: ");
			sexo = in.nextInt();
			
			System.out.println("Se você se considera calmo digite 1, nervoso 2 ou agressivo 3: ");
			psic = in.nextInt();
			
			
			if(idade > 40 && psic ==2 ) {
				nervmaisquarenta ++;
			}
			
			if(psic == 1) {
				calmo++;
			}
			if(sexo == 1 && psic == 2) {
				mnervosa++;
			}
			if(sexo == 2 && psic == 3) {
				hagressivo++;
			}
			if(sexo == 3 && psic == 1) {
				ocalmo++;
			}
			if(idade < 18 && psic == 1 ) {
				calmmdezoito ++;
			}
			
			start++;
		}
		System.out.println("O numero de pessoas calmas é de: "+calmo+
						   "\nO numero de mulheres nervosas é de: "+mnervosa+
						   "\nO numero de homens agressivos é de: "+hagressivo+
						   "\nPessoas que se identificam como outros calmos: "+ocalmo+
						   "\nPessoas nervosas com mais de 40 anos: "+nervmaisquarenta+
						   "\nPessoas calmas com menos de 18 anos"+calmmdezoito);
		in.close();
	}
}
