package HerancaPolimorfismo;

public class TestaAnimal {

	public static void main(String[] args) {
		
		
		Cavalo hourse = new Cavalo ("Hourse",17);
		Preguica many = new Preguica("Many",50);
		Cachorro max = new Cachorro("Max",3);
		
	
		System.out.println("Ol� esse � "+hourse.getNome()+". Ele tem "+hourse.getIdade()+" anos. Esse � o som do cavalo "+ hourse.som());
		System.out.println("Ol� esse � "+many.getNome()+". Ele tem "+many.getIdade()+" anos. Esse � o som da pregui�a "+ many.som());
		System.out.println("Ol� esse � "+max.getNome()+". Ele tem "+max.getIdade()+" anos. Esse � o som do cachorro "+ max.som());
	}

}
