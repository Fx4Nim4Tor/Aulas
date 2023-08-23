package aaa_treinar;

import java.util.Scanner;

public class a_treino01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("marca");
		String marca = teclado.nextLine();
		
		System.out.println("modelo");
		String modelo = teclado.nextLine();
		
		System.out.println("numero de Passageiros");
		int numeroPassageiro = teclado.nextInt();
		
		System.out.println("consumo Medio");
		double consumoMedio = teclado.nextDouble();
		
		System.out.println("capacidade de Combustivel");
		double capacidadeCombustivel = teclado.nextDouble();
		
		teclado.nextLine();
		
		System.out.println("tipo de Combustivel");
		String tipoCombustivel = teclado.nextLine();
		
		a_contrutor_treino01 carro = new a_contrutor_treino01(marca, modelo, numeroPassageiro, consumoMedio, capacidadeCombustivel, tipoCombustivel);
		
		System.out.println(carro);
	}

}
