package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite o custo de fabrica: ");
		x = leia.nextInt();
		
		y = (x * 0.28) + (x * 0.45) + x;
		
		
		System.out.println("O custo ao consumidor será: "+y);
		
		leia.close();
		
	}

}