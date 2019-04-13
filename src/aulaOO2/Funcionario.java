package aulaOO2;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String status;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	double getBonus() {
		return this.salario * 0.05;
	}

	public void verifica() {
		// TODO Auto-generated method stub
		
	}
}