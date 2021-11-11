package br.com.generation.ExerciciosFor;

import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numero, menorvinteum = 0 , maiorcinquenta = 0, start = -1;
		
		while(start != -99 ) {
			
			System.out.println("Digite uma idade em anos: ");
			numero = in.nextInt();	
			
			if(numero == -99) {
				start = -99;
			}
			
			else if(numero < 21) {
				menorvinteum++;
			}
			else if(numero > 50) {
				maiorcinquenta++;
			}
		}
		System.out.println("Foram coletadas idades de: "+menorvinteum+" pessoas com menos de 21 anos e de: "+maiorcinquenta+" pessoas com mais de 50 anos.");
		in.close();
	}

}
