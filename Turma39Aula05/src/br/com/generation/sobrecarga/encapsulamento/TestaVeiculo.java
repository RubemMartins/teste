package br.com.generation.sobrecarga.encapsulamento;

import java.util.Scanner;

public class TestaVeiculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a marca do Ve�culo: ");
		String marca = scan.next();
		
		Veiculo vc = new Veiculo();
		
		vc.setMarca(marca);// Alterando o atributo marca atrav�s do m�todo setMarca
		
		System.out.println(vc.getMarca() + " --> Recuperando os dados do atributo "
				          + "marca atrav�s do m�todo getMarca");

		scan.close();
	}

}
