package br.com.generation.ExerciciosFor;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in);
		int num, impar = 0, par= 0;
		
		for(int i =1; i<= 10 ; i ++) {
			
			
			System.out.println("Digite o "+i+" � n�mero: ");
			num = in.nextInt();	
			
			if(num % 2 == 0) {
			par ++;
			}
			else {
			impar ++;
			}
		}
		System.out.println("Foram digitados: "+impar+" n�meros �mpares e: "+par+" n�meros pares.");
		in.close();
	}
}
