package br.com.generation.aula01;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma, divisao, subtracao, multiplicacao;
		
		System.out.println("Escreva o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Escreva o valor de b: ");
		b = leia.nextInt();
		
		soma = a + b;
		
		subtracao = a - b;
		
		divisao = a / b;
		
		multiplicacao = a * b;
		
		System.out.println("A soma de a com b � : "+soma);
		
		System.out.println("A subtra��o de a com b � : "+subtracao);
		
		System.out.println("A divis�o de a por b � : "+divisao);
		
		System.out.println("A multiplica��o de a com b � : "+multiplicacao);
		
		leia.close();

	}

}
