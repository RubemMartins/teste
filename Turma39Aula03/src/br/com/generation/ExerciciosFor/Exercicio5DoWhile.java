package br.com.generation.ExerciciosFor;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i , soma = 0;
		
		do {
			System.out.println("Digite um numero qualquer: ");
			i= in.nextInt();
			
			soma = soma + i;
		
		}
		
		while(i != 0); 
		System.out.println("A soma dos numeros digitados é igual a :"+soma);
		in.close();
	}
}
