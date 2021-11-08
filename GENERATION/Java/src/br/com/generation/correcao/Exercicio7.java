package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, D, E, F, X, Y;
		
		System.out.println("Digite um valor para A: ");
		A = leia.nextInt();
		
		System.out.println("Digite um valor para B: ");
		B = leia.nextInt();
		
		System.out.println("Digite um valor para C: ");
		C = leia.nextInt();
		
		System.out.println("Digite um valor para D: ");
		D = leia.nextInt();
		
		System.out.println("Digite um valor para E: ");
		E = leia.nextInt();
		
		System.out.println("Digite um valor para F: ");
		F = leia.nextInt();
		
		
		X = (C*E-B*F)/(A*E-B*D);
		Y = (A*F-C*D)/(A*E-B*D);
		
		System.out.println("O valor de X é: " + X + " o valor de Y é: " + Y );
		
		leia.close();
		
	}

}