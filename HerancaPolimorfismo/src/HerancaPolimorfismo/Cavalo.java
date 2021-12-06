package HerancaPolimorfismo;

public class Cavalo extends Animal implements SomdoAnimal{


	public String som() {
		return "Som do cavalo";
	}
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void som(String animalsound) {
		// TODO Auto-generated method stub
		
	}

}
