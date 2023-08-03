package atividade5;

public class Dolar {
	private double cotacao;
	private double qtdDolar;
	
	
	public Dolar(double cotacao, double qtdDolar) {
		super();
		this.cotacao = cotacao;
		this.qtdDolar = qtdDolar;
	}


	public double getCotacao() {
		return cotacao;
	}


	public double getQtdDolar() {
		return qtdDolar;
	}
	
	
	
	public double calcularDolar(){
		return (cotacao * qtdDolar);
	}
	
	public double calcularJuros(){
		return (calcularDolar() + (calcularDolar() * 0.06));
	}
	
	
	public void informaValor(){
		System.out.print("O valor para a quantidade de dolares desejada é: " + calcularJuros());
	}
}
