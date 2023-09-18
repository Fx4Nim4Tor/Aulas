package atividade01;

public abstract class Animal {
	
	protected String nome;
	protected double comprimento;
	protected int numeroDEpatas;
	protected String cor;
	protected String ambiente;
	protected double velocidade;
	
	
	public Animal(String nome, double comprimento, int numeroDEpatas, String cor, String ambiente, double velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroDEpatas = numeroDEpatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}


	@Override
	public String toString() {
		return "\n//////Animal////// \nNome=" + nome + "\nComprimento: " + comprimento + "\nNumeroDEpatas: " + numeroDEpatas + "\nCor: "
				+ cor + "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade +  "\n//////////////////\n";
	}


	
	
	
	
	
}
