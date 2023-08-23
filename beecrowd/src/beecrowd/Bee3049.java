package beecrowd;

import java.util.Scanner;

public class Bee3049 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int b = teclado.nextInt();
		if(b > 0 && b < 160){
			int B = teclado.nextInt();
			if(B > 0 && B < 160){
				double areaTOTAL= (160 * 70); 
				
				double area = (double)((B+b)*70)/2;
				
				
				if(area == (areaTOTAL/2)){
					System.out.println("0");
				}else if(area  <= areaTOTAL){
					System.out.println("2");
				}else if(area > areaTOTAL){
					System.out.println("1");
				}
			}
		}
		

	}

}
