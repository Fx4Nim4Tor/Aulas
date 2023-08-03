package atividade01;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);


		String nome = teclado.nextLine();
		int idade = teclado.nextInt();
		
		Pessoa pessoa = new Pessoa(idade);
		
		System.out.println(nome);
		pessoa.fazAniversario(idade);
		
		teclado.close();
	}

}
