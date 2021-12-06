package HerancaPolimorfismo;

public class Cachorro extends Animal implements SomdoAnimal {

	public String som() {
		return "Som do cachorro";
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void som(String animalsound) {
		// TODO Auto-generated method stub
		
	}

}
