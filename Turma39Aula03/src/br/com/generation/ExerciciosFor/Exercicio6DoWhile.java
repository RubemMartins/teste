package br.com.generation.ExerciciosFor;

import java.util.Scanner;

public class Exercicio6DoWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i , soma = 0, media = 0, divtres = 0;
		
		do {
			System.out.println("Digite um numero qualquer: ");
			i= in.nextInt();
		
		if(i % 3 == 0) {
			divtres++;
			soma = soma + i;
			media = soma/divtres;
		   }
		}
		
		while(i != 0); 
		System.out.println("A m�dia dos n�meros digitados multiplos de 3 � : "+media);
		in.close();
	}
}
