package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {
	
	static int num1 , num2 , outrasoma;// Variaveis globais

	public static void main(String[] args) {

		metodo7();
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		metodo5(num1,num2);// --> Multiplica��o
		metodo8(num1,num2);// -- > Divis�o
		System.out.println("M�todo 6 sendo chamado da "
				+ "classe Externa: "+MetodoFora.metodo6(num1,num2));
		
	}
	
	public static void metodo1() {
		System.out.println("Ol� eu sou o m�todo 1... ");
	}
	
	public static void metodo2() {
		double soma, numero1 = 200.0, numero2 = 100.0;
		soma = numero1 + numero2;
		System.out.println("Soma do m�todo2: "+soma);
	}
	
	public static void metodo3() {
		outrasoma = num1 + num2;
		System.out.println("Resultado m�todo 3: "+outrasoma);
	}
	
	public static void metodo4() {
		System.out.println("Resultado do metodo 3 ... chamado pelo metodo4 : "+outrasoma);
	}
	
	public static void metodo5(int n1, int n2) {
		int multiplicacao = n1 * n2;
		System.out.println("Multiplica��o no m�todo 5: " + multiplicacao);
	}
	
	public static void metodo7() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o n�mero 1: ");
		num1 = scan.nextInt();
		System.out.println("Entre com o n�mero 1: ");
		num2 = scan.nextInt();
		scan.close();
	}
	public static void metodo8(int n1, int n2) {
		int divisao = n1/n2;
		System.out.println("Metodo 8, Divis�o: "+divisao);
	}
}