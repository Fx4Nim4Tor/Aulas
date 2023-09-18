package heranca;

public class Aplicacao {

	public static void main(String[] args) {
		Pessoa[] pessoa = new Pessoa[2];

		pessoa[0] = new Aluno("José", "123.123.123-12", "tcherere", "mails@gmail.com", "49 9 1234-1234", 8.5, "APROVADO");
		pessoa[1] = new Professores("OTITI", "123.123.123-12", "Torres tortas", "mailS3@gmail.com", "49 9 1111-1111", 10.693);
		
		for(Pessoa pessoas : pessoa){
			System.out.println(pessoas);
		}
	}
}
