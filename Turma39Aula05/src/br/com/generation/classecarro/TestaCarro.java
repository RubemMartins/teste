package br.com.generation.classecarro;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Instancia o objeto
		Carro c1 = new Carro();
		
		c1.nome = "Fusca";
		c1.marca = "Volks";
		c1.ano = 1980;
		//c1.velocidade = 0;
		
		System.out.println(c1.nome);
		System.out.println(c1.marca);
		System.out.println(c1.ano);
		System.out.println("Velocidade inicial: "+ c1.velocidade);
		
		c1.acelerar(80);
		System.out.println("Velocidade após aceleração: " + c1.velocidade);
		
		c1.freiar(50);
		System.out.println("Velocidade após freiar: " + c1.velocidade);
	}
}
