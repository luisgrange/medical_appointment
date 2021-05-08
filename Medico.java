
public class Medico {
	private String nome;
	private String CRM = "Null";
	private int matricula;
	
	public Medico() {
		
	}
	public Medico (String nome) {
		this.nome= nome;
	}
	
	public Medico (String nome, String CRM,int matricula) {
		this.nome= nome;
		this.CRM = CRM;
		this.matricula = matricula;
	}
	
	//nome
	public void setNome(String nome) {this.nome = nome;}
	public String getNome() {return this.nome;}
	
	//CRM
	public void setCRM(String CRM) {this.CRM = CRM;}
	public String getCRM() {return this.CRM;}
	
	//matricula
	public void setMatricula(int matricula) {this.matricula = matricula;}
	public int getMatricula() {return this.matricula;}
}
