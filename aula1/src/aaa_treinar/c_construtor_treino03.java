package aaa_treinar;

public class c_construtor_treino03 {
	private int numeroConta;
	private String nome;
	private double saldo;
	
	
	public c_construtor_treino03(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = 0;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public String getNome() {
		return nome;
	}


	public double getSaldo() {
		return saldo;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public void deposito(double valor){
		this.saldo = this.saldo + valor;
		System.out.println("valor depositado seu saldo é de: " + this.saldo);
	}
	
	public void saque(double saque){
		if(this.saldo > (saque + 5)){
			this.saldo = this.saldo - (saque + 5);
			System.out.println("Saque efetuado com sucesso seu saldo disponivel ficou de: " + this.saldo);
		}else{
			System.out.println("o valor do saque ultrapassa o valor do seu saldo \nSaldo: " + this.saldo + "\nSaque: " + saque);
		}
	}
}
