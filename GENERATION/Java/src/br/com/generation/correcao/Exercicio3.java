package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int horas,resto,minutos,segundos,evento;
		
		System.out.println("Digite o tempo de um evento em segundos: ");
		
		evento = leia.nextInt();
		
		horas = evento/3600;
		resto = evento%3600;
		minutos = resto/60;
		segundos = (evento%3600)%60;
		
		System.out.println("o eventou durou," + horas + " hora(s)," + minutos + " minuto(s) e " + segundos + " segundo(s).");
		
		leia.close();
		
	}

}