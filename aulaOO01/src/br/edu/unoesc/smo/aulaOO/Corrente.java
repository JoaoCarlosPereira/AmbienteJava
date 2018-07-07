package br.edu.unoesc.smo.aulaOO;

public class Corrente extends Conta {
	private Double limite;
	
	public Corrente() {
		setLimite(0.0);
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public Boolean verificarSaldoSaque(Double valor) {	
		return valor <= (getLimite() + getSaldo());
	}



}
