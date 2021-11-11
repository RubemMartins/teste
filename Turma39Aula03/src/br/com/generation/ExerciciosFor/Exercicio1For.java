package br.com.generation.ExerciciosFor;

public class Exercicio1For {

	public static void main(String[] args) throws InterruptedException {
		

		for(double num =1000 ; num <= 1999 ; num ++) {
			
			if(num % 11 == 5) {
			System.out.println(num + " divido por 11 tem resto 5");
			Thread.sleep(200);
			}
		}

	}
}