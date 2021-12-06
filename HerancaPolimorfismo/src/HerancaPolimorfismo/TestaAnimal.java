package HerancaPolimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {
		
		
		Cavalo hourse = new Cavalo ("Hourse",17);
		Preguica many = new Preguica("Many",50);
		Cachorro max = new Cachorro("Max",3);
		
	
		System.out.println("Olá esse é "+hourse.getNome()+". Ele tem "+hourse.getIdade()+" anos. Esse é o som do cavalo "+ hourse.som());
		System.out.println("Olá esse é "+many.getNome()+". Ele tem "+many.getIdade()+" anos. Esse é o som da preguiça "+ many.som());
		System.out.println("Olá esse é "+max.getNome()+". Ele tem "+max.getIdade()+" anos. Esse é o som do cachorro "+ max.som());
	}

}
