package br.com.generation.produtoeletronico;

import java.util.Scanner;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		//Instanciando Objeto
		ProdutoEletronico vc = new ProdutoEletronico();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tipo de alimenta��o do produto eletr�nico: ");
		String alimentacao = scan.next();
		vc.setTipoalim(alimentacao);// Alterando o atributo marca atrav�s do m�todo setTipoalim
		
		System.out.println("Digite a marca do produto eletr�nico: ");
		String marca = scan.next();
		vc.setMarca(marca);// Alterando o atributo marca atrav�s do m�todo setMarca
		
		System.out.println("Digite o pre�o do produto eletr�nico: ");
		int preco = scan.nextInt();
		vc.setPreco(preco);// Alterando o atributo pre�o atrav�s do m�todo setPreco
		
		System.out.println(vc.getTipoalim() + " --> Recuperando os dados do atributo "
				          + "tipo de alimenta��o atrav�s do m�todo getTipoalim");
		
		System.out.println(vc.getMarca() + " --> Recuperando os dados do atributo "
				          + "marca atrav�s do m�todo getMarca");

			
		System.out.println(vc.getPreco() + " --> Recuperando os dados do atributo "
				          + "Pre�o atrav�s do m�todo getPreco");


		scan.close();
	}

}
