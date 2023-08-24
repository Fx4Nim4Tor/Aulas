package aula4.enu;

public enum Cores {
	VERMELHO(1, "Vermelho"), 
	AMARELO(2, "Amarelo"), 
	VERDE(3, "Verde"), 
	PRATA(4, "Prata") ,
	BRANCO(5, "Branco");
	
	private int numero;
	private String descricao;
	
	private Cores(int numero, String descricao) {
		this.numero = numero;
		this.descricao = descricao;
	}

	public int getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
