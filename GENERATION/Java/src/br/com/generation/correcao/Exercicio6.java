package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, D;
		
		System.out.println("Digite um valor para X1: ");
		x1 = leia.nextInt();
		
		System.out.println("Digite um valor para X2: ");
		x2 = leia.nextInt();
		
		System.out.println("Digite um valor para Y1: ");
		y1 = leia.nextInt();
		
		System.out.println("Digite um valor para Y2: ");
		y2 = leia.nextInt();
		
		D = Math.sqrt((Math.pow((x1 - x2), 2.0)) + (Math.pow((y1 - y2), 2.0)));
		
		System.out.println("A distância entre os dois pontos é: "+D);
		
		leia.close();
		
	}

}