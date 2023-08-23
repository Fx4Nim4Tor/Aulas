package beecrowd;

import java.util.Scanner;

public class Bee1044 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		
		if(B % A == 0){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
		teclado.close();
	}

}
