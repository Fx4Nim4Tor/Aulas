package heranca;

public class Professores extends Pessoa{
	private double salario;

	public Professores(String nome, String cPF, String endereco, String email, String telefone, double salario) {
		super(nome, cPF, endereco, email, telefone);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	
	@Override
	public String toString() {
		return "\nProfessores \n///////////////////////////\n "+ super.toString() + "salario=" + salario + super.toString() + "\n///////////////////////////////\n";
	}
	
	
}
