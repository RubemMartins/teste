package br.com.generation.laco.repeticao;

public class ExemploWhile02 {

	public static void main(String[] args) throws InterruptedException {
		// La�o de repeti��o --> Enquanto
		
		int contador = 10;
		
		while(contador >= 0 ) {
			System.out.println("Repeti��o: nr "+ contador);
			contador--;
			Thread.sleep(500);
		}

	}

}
