package ExHerança;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro dog   =   new Cachorro();
		Cavalo   horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		dog.setNome("Flokinho");
		dog.setIdade(11);
		dog.setSom("auau");
		dog.setTiporeact("correr na rua ");
		
		horse.setNome("Wilson");
		horse.setIdade(12);
		horse.setSom("Uiiiiiii");
		horse.setTiporeact("Correr no campo ");
		
		sloth.setNome("Marie");
		sloth.setIdade(29);
		sloth.setSom("Rhhhhhhsssgsgshushsu");
		sloth.setSubirEmArvores("subindo em arvores para dormir");
	
		System.out.println("O nome do cachorro e " + dog.getNome());
		System.out.println(("A idade de " +dog.getNome()+ " e: " + dog.getIdade()) );
		System.out.println(("O  " + dog.getNome() + " faz "  + dog.getSom()) );
		System.out.println("O " +dog.getNome() + " foge de casa para ir " + dog.getTiporeact());
		
		System.out.println("\nO nome do Cavalo e " + horse.getNome());
		System.out.println(("A idade de " +horse.getNome()+ " e: " + horse.getIdade()) );
		System.out.println(("O  " + horse.getNome() + " faz "  + horse.getSom()) );
		System.out.println("O " +horse.getNome() + " foge do celeiro para " + horse.getTiporeact());
		
		System.out.println("\nO nome da Dona Priguica e " + sloth.getNome());
		System.out.println(("A idade da " +sloth.getNome()+ " e: " + sloth.getIdade()) );
		System.out.println(("A  " + sloth.getNome() + " faz "  + sloth.getSom()) );
		System.out.println("O " +sloth.getNome() + " foge do trabalho  " + sloth.getSubirEmArvores());
		
	}

}
