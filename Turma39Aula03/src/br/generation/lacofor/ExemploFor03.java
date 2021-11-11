package br.generation.lacofor;

public class ExemploFor03 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int sobe =0, desce = 10; sobe <= 10 && desce >= 0; sobe++, desce--) {
			System.out.println("\n"+ sobe + " "+ desce);
			Thread.sleep(500);
		}

	}

}
