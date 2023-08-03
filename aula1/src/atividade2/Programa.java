package atividade2;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double largura = teclado.nextDouble();
		double altura = teclado.nextDouble();
		
		Retangulo ret = new Retangulo(largura,altura);
		
		System.out.println("AREA: " + ret.calculaArea());
		System.out.println("PERIMETRO " + ret.calculaPerimetro());
		System.out.println("DIAGONAL " + ret.calculaDiagonal());
		
		teclado.close();
	}
		
}
