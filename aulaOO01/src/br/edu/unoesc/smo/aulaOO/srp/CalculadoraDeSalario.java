package br.edu.unoesc.smo.aulaOO.srp;

public class CalculadoraDeSalario {

	public Double calcular(Funcionario funcionario) {
		return funcionario.getCargo().calcular(funcionario);
	}
}
