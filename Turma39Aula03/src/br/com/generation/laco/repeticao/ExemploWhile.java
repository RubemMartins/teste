package br.com.generation.laco.repeticao;

public class ExemploWhile {

	public static void main(String[] args) throws InterruptedException {
		// Laço de repetição --> Enquanto
		
		int contador = 0;
		
		while(contador <= 10 ) {
			System.out.println("Repetição: nr "+ contador);
			contador++;
			Thread.sleep(500);
		}

	}

}
