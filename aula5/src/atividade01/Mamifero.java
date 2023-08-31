package atividade01;

public class Mamifero extends Animal{
	private String alimento;

	
	public Mamifero(String nome, double comprimento, int numeroDEpatas, String cor, String ambiente, double velocidade,
			String alimento) {
		super(nome, comprimento, numeroDEpatas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}


	@Override
	public String toString() {
		return "\nMamifero \nAlimento: " + alimento + super.toString() + "///////////////////";
	}


	
	
	
	
}
