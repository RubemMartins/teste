package br.com.generation.Exerciciosvetormatriz;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {
	
	try (Scanner entrada = new Scanner(System.in)) {
		double[] notas = new double[5];
		double maior = 0.0;
		int i;
		
		for(i= 0; i < notas.length; i++) {
			
			System.out.println("Digite a "+(i+1)+" º nota do Aluno: ");
			notas[i] = entrada.nextDouble();
			
			if(notas[i] > maior) {
				maior = notas[i];
			}
		}
			
			for(i= 0; i < notas.length; i++) {
				
				System.out.print(notas[i] + "|");
	
				}
		
		System.out.println(" A maior das notas: "+maior);
		entrada.close();
		}
	}
}
