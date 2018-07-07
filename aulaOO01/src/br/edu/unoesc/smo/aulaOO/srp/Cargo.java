package br.edu.unoesc.smo.aulaOO.srp;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()), 
	DBA(new QuinzeOuVinteCincoPorcento()), 
	TESTER(new QuinzeOuVinteCincoPorcento());

	Cargo(RegraCalculo regraCalculo) {
		this.regraCalculo = regraCalculo;
	}

	private RegraCalculo regraCalculo;
	
	public Double calcular(Funcionario funcionario) {
		return regraCalculo.Calcular(funcionario);
	}
}
