package br.com.generation.ex1cliente;

public class Cliente {

		// Atributos
		String nome;
		String sexo;
		int ncliente;
		int rendamensal;
		
		//m�todos
		void aumento(int maisdin) {
			rendamensal += maisdin;
	}
		void reducao(int menosdin) {
			rendamensal -= menosdin;
		}

}
