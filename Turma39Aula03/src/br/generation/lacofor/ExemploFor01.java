package br.generation.lacofor;

public class ExemploFor01 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i =0; i <= 10; i++) {
			
			System.out.println("Repetindo a vari�vel i: "+i);
			Thread.sleep(500);
			
			if(i==10) {
				System.out.println("Fim das repeti��es");
			}
		}

	}

}
