package br.com.generation.vetor;

import java.util.Scanner;

public class ExemploMatriz03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		
		System.out.println("===Notas do Aluno===");
		
		//Adicionando Valores na Matriz
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Digite �s notas: [%d] [%d]", l,c);
				notasAlunos[l][c] = entrada.nextDouble();
			}
			System.out.println();
		}
		
		//Imprimindo Valores da Matriz
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print(notasAlunos[l][c] + "|");
			} 
			System.out.println();
		}
		entrada.close();
	}

}
