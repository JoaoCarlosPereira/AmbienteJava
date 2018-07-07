package br.edu.unoesc.smo.aulaOO;

public class Poupanca extends Conta {
	private Double rendimento;

	public Poupanca() {
		setRendimento(0.0);
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public Boolean verificarSaldoSaque(Double valor) {
		return valor <= getSaldo();
	}
		
}
