package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, total, bissexto;
		
		System.out.println("Digite sua idade em anos, meses e dias: ");
		anos = leia.nextInt();
		meses = leia.nextInt();
		dias = leia.nextInt();
		bissexto = anos / 4;
		
		total = (anos*365)+ bissexto + (meses*30) + dias;
		
		System.out.println("Sua idade expressa somente em dias é de : "+total+" dias.");
		
		leia.close();
		
	}

}
