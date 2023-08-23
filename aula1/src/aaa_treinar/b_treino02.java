package aaa_treinar;

import java.util.Scanner;

public class b_treino02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] telefone = new String[3];
		
		System.out.println("Nome");
		String nome = teclado.nextLine();
		
		System.out.println("email");
		String email = teclado.nextLine();
		
		System.out.println("endereco");
		String endereco = teclado.nextLine();
		
		System.out.println("telefone");
		for(int i = 0;i < 3; i++) {
			telefone[i] = teclado.nextLine();
		}
		
		b_construtor_treino02 contatos = new b_construtor_treino02(nome, email, endereco, telefone);
		System.out.println(contatos.toString());
		
	}

}
