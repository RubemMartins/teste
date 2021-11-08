package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Escreva o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Escreva o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Escreva o valor de C: ");
		c = leia.nextDouble();
		
		r =  Math.pow((a + b), 2.0);
		s =  Math.pow((b + c), 2.0);
		d = (r + s) / 2;
		
		System.out.println("Valor de S: "+s+" Valor de R: "+r+" Valor de D: "+d);
		
		leia.close();
	}

}
