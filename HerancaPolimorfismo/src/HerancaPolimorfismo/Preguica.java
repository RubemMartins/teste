package HerancaPolimorfismo;

public class Preguica extends Animal implements SomdoAnimal  {

	public String som() {
		return "Som da Preguiça";
	}
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void som(String animalsound) {
		// TODO Auto-generated method stub
		
	}

}
