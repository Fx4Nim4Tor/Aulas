package aaa_treinar;

import java.util.Arrays;

public class b_construtor_treino02 {
	private String nome;
	private String email;
	private String endereco;
	private String[] telefone = new String[5];
	
	public b_construtor_treino02(String nome, String email, String endereco, String[] telefone) {
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}

	public String[] getTelefone() {
		return telefone;
	}

	
	@Override
	public String toString() {
		return "\nNome=" + nome + "\nEmail=" + email + "\nEndereco=" + endereco + "\nTelefone="
				+ Arrays.toString(telefone);
	}
	
	
}
