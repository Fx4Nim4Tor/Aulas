package aaa_treinar;

public class a_contrutor_treino01 {
	private String marca;
	private String modelo;
	private int numeroPassageiro;
	private double consumoMedio;
	private double capacidadeCombustivel;
	private String tipoCombustivel;
	
	
	public a_contrutor_treino01(String marca, String modelo, int numeroPassageiro, double consumoMedio,
			double capacidadeCombustivel, String tipoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiro = numeroPassageiro;
		this.consumoMedio = consumoMedio;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.tipoCombustivel = tipoCombustivel;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public int getNumeroPassageiro() {
		return numeroPassageiro;
	}


	public double getConsumoMedio() {
		return consumoMedio;
	}


	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}


	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	
	
	public double autonomiaCarro(){
		double autonomiaCarro = 0;
		return autonomiaCarro = (capacidadeCombustivel / consumoMedio);
	}


	@Override
	public String toString() {
		return "Marca: " + marca + ", \nModelo: " + modelo + "\nNumero de Passageiros: " + numeroPassageiro
				+ "\nConsumo medio: " + consumoMedio + ",\nCapacida de Combustivel: " + capacidadeCombustivel
				+ "\nTipo de Combustivel: " + tipoCombustivel + "\nAutonomia do Carro " + String.format("%.2f",autonomiaCarro());
	}
	
	
}
