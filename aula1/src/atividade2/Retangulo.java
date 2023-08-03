package atividade2;

public class Retangulo {
	private double largura;
	private double altura;
	private double area;
	
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
		this.area = 0;
	}


	public double getArea() {
		return area;
	}


	public double getLargura() {
		return largura;
	}


	public double getAltura() {
		return altura;
	}
	
	public double calculaArea(){
		return largura * altura;
		
	}
	
	public double calculaPerimetro(){
		return((largura + altura)/2);
		
	}
	
	public double calculaDiagonal(){
		return (Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2)));
	}
}
