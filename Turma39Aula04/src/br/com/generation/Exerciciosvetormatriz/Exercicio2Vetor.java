package br.com.generation.Exerciciosvetormatriz;

import java.util.Random;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		
		Random saidadado = new Random();
		double[] dado = new double[10];
		double maior = 0.0, media = 0, soma = 0;
		int i, vezes = 1;
		
		for(i= 0; i < dado.length; i++) {
			
			dado[i] = saidadado.nextInt(6)+1;
			
			soma += dado[i];
			media = soma / dado.length ;
			
			while(dado[i] != 6)
			if(maior < dado[i]) {
				maior = dado[i];
			}
			if(dado[i] == maior) {	
			vezes++;	
			}
		}	
			for(i= 0; i < dado.length; i++) {
				System.out.print(dado[i] + "|");
				}
		System.out.println(" A média aritmética dos valores lançados é: "+media+". O maior valor anotado: "+maior+" e saiu "+vezes+" vezes.");
	}
}