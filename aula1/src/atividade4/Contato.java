package atividade4;

import java.util.Arrays;

public class Contato {
	private String nome;
	private String email;
	private String endereco;
	private String[] tel = new String[5];
	
	
	public Contato(String nome, String email, String endereco, String[] tel) {
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.tel = tel;
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


	public String[] getTel() {
		return tel;
	}


	@Override
	public String toString() {
		return "[nome=" + nome + 
				", email=" + email + 
				", endereco=" + endereco + 
				", tel=" + Arrays.toString(tel)
				+ "]";
	}
	
	
	
	
}
