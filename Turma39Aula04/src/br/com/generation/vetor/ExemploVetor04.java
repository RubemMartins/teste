package br.com.generation.vetor;

import java.util.Scanner;

public class ExemploVetor04 {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			double[] notas = new double[4];
			double soma = 0.0, media = 0.0;
			int i;
			
			for(i= 0; i < notas.length; i++) {
				System.out.println("Digite a "+(i+1)+" º nota do Aluno: ");
				notas[i] = entrada.nextDouble();
				soma += notas[i];
				media = soma / notas.length ;
			}
			
			System.out.println("A soma das notas: "+soma);
			System.out.println("\nA média do aluno: "+media);
			
			entrada.close();
		}
	}

}
