package aaa_treinar;

import java.util.Scanner;

public class c_treino03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numero da Conta");
		int numeroConta = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Nome");
		String nome = teclado.nextLine();
	
		System.out.println("deseja realizar um deposito inicial?  S/N");
		String simNAO = teclado.nextLine().toUpperCase().trim();
		
		
		c_construtor_treino03 conta = new c_construtor_treino03(numeroConta, nome);
		
		if(simNAO.equals("S")){
			System.out.println("qual o valor que deseja depositar?");
			double valor = teclado.nextDouble();
			conta.deposito(valor);
			
		}else{
			System.out.println("Voce optou por nao fazer um deposito inicial o saldo da sua conta é de " + conta.getSaldo());
		}
		
		teclado.nextLine();
		
		System.out.println("Deseja fazer um saque? S/N");
		simNAO = teclado.nextLine().toUpperCase().trim();
		
		if(simNAO.equals("S")){
			System.out.println("Qual o valor que deseja sacar?");
			double saque = teclado.nextDouble();
			conta.saque(saque);
		}else{
			System.out.println("ok, saque nao realizado");
		}
		
		System.out.println("O saldo restante na sua conta é de: " + conta.getSaldo());

	}	
	
}
