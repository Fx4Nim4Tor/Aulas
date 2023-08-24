package atividade01;

public class Programa {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("mauricio", "mauricio@gmail.com", "(49) 99111-9680", "T.I.", 5782.34);
		Funcionario funcionario2 = new Funcionario("pedro", "pedro@gmail.com", "(49) 561341-3460", "fake naty.", 6782.34);
		
		Funcionario[] funcionario = {funcionario1, funcionario2};
		Gerente gerente = new Gerente("Chefe", "chefe@gmail.com", "(49) 9 26736222", "Chefe", 30724, funcionario);
		
		System.out.println(funcionario);
		System.out.println(gerente);
	}

}
