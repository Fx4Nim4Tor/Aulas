package atividade5;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double cotacao = teclado.nextDouble();
		double qtdDolar = teclado.nextDouble();
		
		Dolar dolar = new Dolar(cotacao, qtdDolar);
		dolar.informaValor();
		
		teclado.close();
	}

}
