package br.com.generation.laco.repeticao;

public class ExemploWhile {

	public static void main(String[] args) throws InterruptedException {
		// La�o de repeti��o --> Enquanto
		
		int contador = 0;
		
		while(contador <= 10 ) {
			System.out.println("Repeti��o: nr "+ contador);
			contador++;
			Thread.sleep(500);
		}

	}

}
