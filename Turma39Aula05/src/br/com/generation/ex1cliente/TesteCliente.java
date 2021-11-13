package br.com.generation.ex1cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		// Instanciado o objeto
		Cliente c1 = new Cliente();
		
		c1.nome = "Sergio";
		c1.sexo = "Masculino";
		c1.ncliente = 0001;
		c1.rendamensal = 1500;
		
		System.out.println("Nome: "+c1.nome);
		System.out.println("Sexo: "+c1.sexo);
		System.out.println("Nº do cliente: "+c1.ncliente);
		System.out.println("Renda mensal: "+c1.rendamensal+ " $.");
		
		c1.aumento(500);
		System.out.println("Renda Mensal após aumento de salario: " + c1.rendamensal);
		
		c1.reducao(1000);
		System.out.println("Renda Mensal após redução de salario: " + c1.rendamensal);
	}

}
