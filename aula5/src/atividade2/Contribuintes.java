package atividade2;

public abstract class Contribuintes {
	protected String nome;
	protected double salario;
	
	public Contribuintes(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	
	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	
		
	
	
	
	
	
}
