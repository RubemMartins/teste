package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, media;
		
		System.out.println("Digite a primeira nota: ");
		a = leia.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		b = leia.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		c = leia.nextInt();
		
		a = a*0.4 ;
		b = b*0.6 ;
		media = (a+b+c)/3;
		
		System.out.println("A nota final é: "+media);
		
		leia.close();
		
	}

}