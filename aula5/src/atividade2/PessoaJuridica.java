package atividade2;

public class PessoaJuridica extends Contribuintes{
	private String CNPJ;

	public PessoaJuridica(String nome, double salario, String cNPJ) {
		super(nome, salario);
		CNPJ = cNPJ;
	}
	
	
}
