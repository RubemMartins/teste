package br.com.generation.Exerciciosvetormatriz;

import java.util.Scanner;

public class Exercicio3Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double[][] N1 = new double[2][4];
		double[][] N2 = new double[2][4];
		double[][] M1 = new double[2][4];
		double[][] M2 = new double[2][4];
		
		System.out.println("===Notas do Aluno===");
		
		//Adicionando Valores na Matriz
		for(int l = 0; l < N1.length; l++) {
			for(int c = 0; c < N1[l].length; c++) {
				System.out.printf("Digite às notas para posição --> [%d] [%d] da Matriz N1--> ", l,c);
				N1[l][c] = entrada.nextDouble();
				
				System.out.printf("Digite às notas para posição --> [%d] [%d] da Matriz N2 --> ", l,c);
				N2[l][c] = entrada.nextDouble();

				M1[l][c] = N1[l][c]+N2[l][c];

				M2[l][c] = N1[l][c]-N2[l][c];
			}
		}
		//Imprimindo Valores da Matriz
		for(int l = 0; l < N1.length; l++) {
			for(int c = 0; c < N1[l].length; c++) {
				System.out.println(M1[l][c] + " | " + M2[l][c]+"\n");
			} 
		}
		entrada.close();
	}

}

	