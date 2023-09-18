package heranca;

public class Aluno extends Pessoa{
	private double media;
	private String situacao;
	
	
	public Aluno(String nome, String cPF, String endereco, String email, String telefone, double media,
			String situacao) {
		super(nome, cPF, endereco, email, telefone);
		this.media = media;
		this.situacao = situacao;
	}


	public double getMedia() {
		return media;
	}


	public String getSituacao() {
		return situacao;
	}


	@Override
	public String toString() {
		return "\nAluno \n///////////////////////////////\n" + super.toString() + " media=" + media + ", situacao=" + situacao + "\n///////////////////////////////\n";
	}


	
	
}
