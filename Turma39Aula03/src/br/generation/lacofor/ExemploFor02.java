package br.generation.lacofor;

public class ExemploFor02 {

	public static void main(String[] args) throws InterruptedException {
		
		int n = 20;
		int i, soma;
		
		//inicialização; condição; incremento(++) ou decremento(--)
		
		for(i = 0, soma = 0; i <= n; i++) {
			
			System.out.print("Soma: " + soma+ " + " + i);
			soma +=  i; // soma = soma + i
			System.out.print(" = "+ soma + "\n");
			Thread.sleep(500);
		}

	}

}
