package br.edu.unoesc.smo.aulaOO.srp;

public class QuinzeOuVinteCincoPorcento implements RegraCalculo {

	@Override
	public Double Calcular(Funcionario funcionario) {
		if (funcionario.getSalario() > 2000.0) {
			return funcionario.getSalario() * 0.80;
		} else {
			return funcionario.getSalario() * 0.90;
		}
	}

}
