package atividade4;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] tel = new String[3];
		
		
		System.out.println("nome");
		String nome = teclado.nextLine();
		System.out.println("gmail");
		String gmail = teclado.nextLine();
		System.out.println("endereco");
		String endereco = teclado.nextLine();
		System.out.println("numero");
		for(int i = 0; i < 3;i++){
			tel[i] = teclado.nextLine();
		}
		
		Contato contato = new Contato(nome,gmail,endereco,tel);
		System.out.println(contato.toString());
		
		teclado.close();
	}

}
