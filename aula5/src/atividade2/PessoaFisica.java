package atividade2;

import java.util.Scanner;

public class PessoaFisica extends Contribuintes{
	private String CPF;

	public PessoaFisica(String nome, double salario, String cPF) {
		super(nome, salario);
		CPF = cPF;
	}
	
	public String getCPF() {
		return CPF;
	}

	

	public void imposto(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("IRPF");
		double IRPF = teclado.nextDouble();
		
		
		if(this.salario < 1903.98){
			System.out.println("POBRE");
		}else if(this.salario < 2826.65){
			this.salario -= (this.salario * 0.075 - IRPF);
		}else if(this.salario < 3751.05){
			this.salario -= (this.salario * 0.015 - IRPF);
		}else if(this.salario < 4664.68){
			this.salario -= (this.salario * 0.0)
		}else{
			
		}
	}
}
