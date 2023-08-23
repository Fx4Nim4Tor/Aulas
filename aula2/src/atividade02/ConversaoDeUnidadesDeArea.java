package atividade02;

import java.util.Scanner;

public class ConversaoDeUnidadesDeArea {
	
	public static double metro(double m) {
		return m * 10.76;
	}
	
	public static double pe(double m) {
		return m * 929;
	}
	
	public static double milha(double m) {
		return m * 640;
	}
	
	public static double acre(double m) {
		return m * 43.560;
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println();
		double m = teclado.nextDouble();
		
		System.out.println(ConversaoDeUnidadesDeArea.metro(m));
		System.out.println(ConversaoDeUnidadesDeArea.pe(m));
		System.out.println(ConversaoDeUnidadesDeArea.milha(m));
		System.out.println(ConversaoDeUnidadesDeArea.acre(m));
	}
}
