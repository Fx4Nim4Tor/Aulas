package atividade2;


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
		double IRPF = 0;
		
		if(this.salario < 1903.98){
			System.out.println("POBRE");
		}else if(this.salario < 2826.65){
			IRPF = (this.salario * 0.075);
			this.salario = this.salario - IRPF;
			System.out.println("O valor do IRPF retirado do seu salario é de: " + IRPF + "\nSeu salario ficou de: " + this.salario);
			
			
		}else if(this.salario < 3751.05){
			IRPF = (this.salario * 0.15);
			this.salario = this.salario - IRPF;
			System.out.println("O valor do IRPF retirado do seu salario é de: " + IRPF + "\nSeu salario ficou de: " + this.salario);
			
			
		}else if(this.salario < 4664.68){
			IRPF = (this.salario * 0.225);
			this.salario = this.salario - IRPF; 
			System.out.println("O valor do IRPF retirado do seu salario é de: " + IRPF + "\nSeu salario ficou de: " + this.salario);
			
			
		}else{
			
		}
	}
}
