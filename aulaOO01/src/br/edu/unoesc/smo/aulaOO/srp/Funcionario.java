package br.edu.unoesc.smo.aulaOO.srp;

public class Funcionario {
	private String nome;
	private Cargo cargo;
	private Double salario;

	public Double calcularSalario() {
		return getCargo().calcular(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
