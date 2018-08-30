public class ProfessorHorista extends Professor{
	private int total_horas;
	private String salario_hora;

	public ProfessorHorista(String nome, String matricula, int idade, int total_horas, String salario_hora){
		super(nome, matricula, idade);		
		this.total_horas = total_horas;
		this.salario_hora = salario_hora;
	}

	public int getTotalHoras(){
		return this.total_horas;
	}

	public String getSalarioHora(){
		return this.salario_hora;
	}

	public void setTotalHoras(int total_horas){
		this.total_horas = total_horas;
	}

	public void setSalarioHora(String salario_hora){
		this.salario_hora = salario_hora;
	}
	
}
