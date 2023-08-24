package aula4.enu;

public class Carro {
	private int ano;
	private String marca;
	private String modelo;
	private Cores cores;
	private String placa;
	

	public Carro(int ano, String marca, String modelo, Cores cores, String placa) {
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.cores = cores;
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Cores getCores() {
		return cores;
	}

	public String getPlaca() {
		return placa;
	}
	
	
}
