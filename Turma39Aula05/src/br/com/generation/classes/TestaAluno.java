package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		// Instanciando(criando) o objeto Aluno
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno2.nome = "Rodrigo";
		aluno2.idade = 20;
		aluno2.curso = "Bloco II - Java Misturado";
		
		aluno1.nome = "Rubem";
		aluno1.idade = 25;
		aluno1.curso = "Bloco 1 - Java Puro";
		
		System.out.println(aluno1.nome);
		System.out.println(aluno1.idade);
		System.out.println(aluno1.curso);
		aluno1.estudar();
		
		System.out.println();
		
		System.out.println(aluno2.nome);
		System.out.println(aluno2.idade);
		System.out.println(aluno2.curso);
		aluno2.assistiraula();
	}
}
