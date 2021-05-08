
public class Agendamento {
	private Medico medico = new Medico();
	private String especialidade;
	private int dia;
	private int mes;
	
	//construtor
	public Agendamento() {}
	
	public Agendamento(String nome) {
		this.medico.setNome(nome);
	}
	
	public Agendamento(String nome, String CRM, int matricula) {
		this.medico.setNome(nome);
		this.medico.setCRM(CRM);
		this.medico.setMatricula(matricula);
	}
	
	//especialidade
	public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}
	public String getEspecialidade() {return this.especialidade;}
	
	//dia
	public void setDia(int dia) {this.dia = dia;}
	public int getDia() {return this.dia;}
	
	//mes
	public void setMes(int mes) {this.mes = mes;}
	public int getMes() {return this.mes;}
	
	//nome
	public void setNome(String nome) {this.medico.setNome(nome);}
	public String getNome() {return this.medico.getNome();}
	
	//CRM
	public void setCRM(String CRM) {this.medico.setCRM(CRM);}
	public String getCRM() {return this.medico.getCRM();}
		
	//matricula
	public void setMatricula(int matricula) {this.medico.setMatricula(matricula);}
	public int getMatricula() {return this.medico.getMatricula();}
	
	//relatorio
	public void Relatorio() {
		System.out.printf("Medico: %s - CRM: %s\n", this.medico.getNome(), this.medico.getCRM());
		System.out.printf("Especialidade: %s\n", getEspecialidade());
		System.out.printf("Data: %d/%d/2021\n", getDia(), getMes());
		System.out.println();
		
	}
}
