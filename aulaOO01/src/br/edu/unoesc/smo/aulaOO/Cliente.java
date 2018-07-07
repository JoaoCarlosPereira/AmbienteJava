package br.edu.unoesc.smo.aulaOO;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private List<Conta> contas;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public void adicionarConta(Conta conta) {
		if (contas == null) {
			contas = new ArrayList<>();
		}
		contas.add(conta);
	}

	public void removerConta(Conta conta) {
		if (contas != null) {
			contas.remove(conta);
		}
	}

	public Double calcularSaldoGeral() {
//		Double total = 0.0;
		
//		contas.forEach(conta->{
//			conta.getSaldo();
//		});
		return contas.stream().mapToDouble(Conta::getSaldo).sum();
//		for (Conta conta: contas) {
//			total += conta.getSaldo();
//		}
//		return total;
	
	}

	public List<Conta> getContas() {
		return contas;
	}

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

}
