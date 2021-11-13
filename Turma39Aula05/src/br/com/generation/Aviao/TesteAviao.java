package br.com.generation.Aviao;

public class TesteAviao {

	public static void main(String[] args) {
		
		// Instancia o objeto 
		Aviao a1 = new Aviao();
		
		a1.capacidadepass = 250;
		a1.companhia = "Tam";
		a1.destino = "Brasil/França";
		
		System.out.println("Capacidade de passageiros: "+a1.capacidadepass);
		System.out.println("Companhia aerea : "+a1.companhia);
		System.out.println("Rota de voo, origem/destino: "+a1.destino);

	}

}
