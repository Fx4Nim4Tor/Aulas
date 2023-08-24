package atividade01;

import java.util.Arrays;

public class Gerente extends Funcionario {
	
	
	private Funcionario numeroFuncionarios[];


	public Gerente(String nome, String email, String telefone, String setor, double salario,
			Funcionario[] numeroFuncionarios) {
		super(nome, email, telefone, setor, salario);
		this.numeroFuncionarios = numeroFuncionarios;
	}


	@Override
	public String toString() {
		return " Funcionarios: " + Arrays.toString(numeroFuncionarios) + "\nnome Gerente: " + getNome()
				+ " \nEmail Gerente: " + getEmail() + " \nTelefone Gerente: " + getTelefone() + " \nSetor Gerente: " + getSetor()
				+ " \n Salario Gerente: " + getSalario() ;
	}



	

	
	
	
	
	
}
