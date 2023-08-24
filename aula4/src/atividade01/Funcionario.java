package atividade01;

public class Funcionario {
	private String nome;
	private String email;
	private String telefone;
	private String setor;
	private double salario;
	
	public Funcionario(String nome, String email, String telefone, String setor, double salario) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.setor = setor;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getSetor() {
		return setor;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "\n////////////////////////////////////////////////\n" + "Funcionario nome: " + nome + " \nemail: " + email + " \ntelefone: " + telefone + " \nsetor: " + setor
				+ " \nsalario: " + salario + "\n////////////////////////////////////////////////\n";
	}
	
	
}
