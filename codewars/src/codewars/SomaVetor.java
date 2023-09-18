package codewars;

public class SomaVetor {

	public static void main(String[] args) {
		int[] amigo = {1,-4,7,12};
		
		System.out.println(soma(amigo));
	}
	public static double soma(int[] numero){
		int soma=0;
		
		for(int i = 0;i < 4; i++){
			if(numero[i] < 0){
			}else{
				soma = soma + numero[i];
			}
		}
		return soma;
	}
}
