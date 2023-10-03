package jogodaveia;

import java.util.Scanner;

public class JogoDaVeia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int linha, coluna;
		do {
			
			System.out.printf("\n1     |   |   \n   ---+---+---\n2     |   |   \n   ---+---+---\n3     |   |   \n");
			System.out.printf("\n    1   2   3\n");
			System.out.printf("selecione a linha:");
			linha = teclado.nextInt();
			coluna = teclado.nextInt();
		} while (linha < 1 || linha > 3) && (coluna < 1 || coluna > 3);
		
	}

}
