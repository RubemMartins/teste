package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Digite sua idade em dias: ");
		
		dias = leia.nextInt();
		anos = dias / 365;
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		
		System.out.println("Sua idade é de : "+anos+" anos, "+meses+" meses e "+dias+" dias.");
		
		leia.close();
		
	}

}