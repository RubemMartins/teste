package br.com.generation.classecarro;

public class Carro {

	//Atributos
	String nome;
	String marca;
	int ano;
	int velocidade = 0;
	
	//m?todos
	void acelerar(int aceleracao){
		velocidade += + aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade -=  reduzir;
	}
}
