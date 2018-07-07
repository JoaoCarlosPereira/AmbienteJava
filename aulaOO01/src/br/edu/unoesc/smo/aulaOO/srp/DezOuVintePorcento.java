package br.edu.unoesc.smo.aulaOO.srp;

public class DezOuVintePorcento implements RegraCalculo {

	@Override
	public Double Calcular(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000.0) {
			return funcionario.getSalario() * 0.75;
		} else {
			return funcionario.getSalario() * 0.85;
		}
	}

}
