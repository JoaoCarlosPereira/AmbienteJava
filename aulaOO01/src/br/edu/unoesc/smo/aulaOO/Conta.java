package br.edu.unoesc.smo.aulaOO;

public abstract class Conta {
	// Atributo
	private Double saldo;
	private Cliente cliente;
	private Agencia agencia;

	public Conta() {
		saldo = 0.0;
	}

	// Método
	public void depositar(Double valor) {
		saldo += valor;
	}

	public abstract Boolean verificarSaldoSaque(Double valor);

	public void sacar(Double valor) {
		if (verificarSaldoSaque(valor)) {
			saldo -= valor;
		}

	}

	public Double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		this.cliente.adicionarConta(this);
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

}
