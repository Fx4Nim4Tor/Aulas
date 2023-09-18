package heranca;

public abstract class Pessoa {
	protected String nome;
	protected String CPF;
	protected String endereco;
	protected String email;
	protected String telefone;
	
	public Pessoa(String nome, String cPF, String endereco, String email, String telefone) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + ", endereco=" + endereco + ", email=" + email + ", telefone="
				+ telefone + ", getNome()=" + getNome() + ", getCPF()=" + getCPF() + ", getEndereco()=" + getEndereco()
				+ ", getEmail()=" + getEmail() + ", getTelefone()=" + getTelefone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
