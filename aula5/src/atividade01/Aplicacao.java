package atividade01;

public class Aplicacao {

	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Mamifero("Ornitorrinco", 50, 4, "Marrom", "Terra e Agua", 5, "Carnivero");
		animal[1] = new Mamifero("Furao", 30, 4,"Marrom", "Minha casa", 10, "Carne");
		animal[2] = new Peixe("Bacalhau", 1.50, 0, "Cinza Escuro", "Mar", 20, "Barbatanas e Calda");
	
		
		for(Animal animais : animal){
			System.out.println(animais);
		}

	}

}
