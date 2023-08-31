package atividade01;

public class Peixe extends Animal{
	private String caracteristica;

	public Peixe(String nome, double comprimento, int numeroDEpatas, String cor, String ambiente, double velocidade,
			String caracteristica) {
		super(nome, comprimento, numeroDEpatas, cor, ambiente, velocidade);
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		return "\nPeixe \nCaracteristica: " + caracteristica + super.toString() + "/////////////////";
	}

	
}
