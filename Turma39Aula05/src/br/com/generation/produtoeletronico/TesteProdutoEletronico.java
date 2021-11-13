package br.com.generation.produtoeletronico;

import java.util.Scanner;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		//Instanciando Objeto
		ProdutoEletronico vc = new ProdutoEletronico();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tipo de alimentação do produto eletrônico: ");
		String alimentacao = scan.next();
		vc.setTipoalim(alimentacao);// Alterando o atributo marca através do método setTipoalim
		
		System.out.println("Digite a marca do produto eletrônico: ");
		String marca = scan.next();
		vc.setMarca(marca);// Alterando o atributo marca através do método setMarca
		
		System.out.println("Digite o preço do produto eletrônico: ");
		int preco = scan.nextInt();
		vc.setPreco(preco);// Alterando o atributo preço através do método setPreco
		
		System.out.println(vc.getTipoalim() + " --> Recuperando os dados do atributo "
				          + "tipo de alimentação através do método getTipoalim");
		
		System.out.println(vc.getMarca() + " --> Recuperando os dados do atributo "
				          + "marca através do método getMarca");

			
		System.out.println(vc.getPreco() + " --> Recuperando os dados do atributo "
				          + "Preço através do método getPreco");


		scan.close();
	}

}
