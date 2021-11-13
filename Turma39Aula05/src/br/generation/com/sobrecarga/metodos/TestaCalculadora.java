package br.generation.com.sobrecarga.metodos;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora mc = new MinhaCalculadora();
		
		System.out.println("Soma1 : "+mc.soma(8.7, 1.99));
		System.out.println("Soma2 : "+mc.soma(8.70, 1.99, 50));

	}

}
