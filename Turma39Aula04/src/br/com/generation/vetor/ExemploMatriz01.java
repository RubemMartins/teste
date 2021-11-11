package br.com.generation.vetor;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 10.0;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8.5;
		
		notasAlunos[1][0] = 10.0;
		notasAlunos[1][1] = 7.9;
		notasAlunos[1][2] = 6.5;
		notasAlunos[1][3] = 8.5;
		
		// ==Impressão da Matriz==//
		for(int l = 0; 1 < notasAlunos.length; l++) {//caminhar nas linhas
			for(int c = 0; c<notasAlunos[l].length; c++) {// caminhas nas colunas
				System.out.print(notasAlunos[l][c]+"|");
			}
			System.out.println();
		}

	}

}
