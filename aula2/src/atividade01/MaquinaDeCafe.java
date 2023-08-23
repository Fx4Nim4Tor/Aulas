package atividade01;

public class MaquinaDeCafe {
	private static int quantidadePoDisponivel = 0;
	
	public void fazerCafe(int quantidadePo) {
		if (quantidadePoDisponivel < quantidadePo){
			System.out.println("Não há pó suficiente para fazer seu café");
		} else {
			quantidadePoDisponivel -= quantidadePo;
			System.out.println("Fazendo café com " + quantidadePo + " gramas de café.");
		}
	}
	
	public static void setQuantidadePoDisponivel(int quantidadePo) {
			MaquinaDeCafe.quantidadePoDisponivel += quantidadePo;
	}
	
	public void fazerCafe() {
		fazerCafe(10);
	}

	public static void main(String[] args) {
		MaquinaDeCafe.setQuantidadePoDisponivel(100);
		MaquinaDeCafe cafe = new MaquinaDeCafe();
		cafe.fazerCafe();
		cafe.fazerCafe(50);
		cafe.fazerCafe(200);
	}
		
}
