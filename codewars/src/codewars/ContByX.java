package codewars;

import java.util.ArrayList;
import java.util.List;

public class ContByX {
	public static void main(String[] args) {
		try {
			System.out.println(conta(10, 20));
		}catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	public static List<Integer> conta(int min, int max){
		if(min < max){
			List<Integer> contando = new ArrayList<>();
			for(;min <= max;min++){
				contando.add(min);
			}
			return contando;
		}else{
			throw new IllegalArgumentException("O primeiro valor deve ser menor que o segundo");
		}
	}
	
}
