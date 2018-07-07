package br.edu.unoescsmo.bootweb.regras;

import org.springframework.stereotype.Service;

@Service
public class PessoaPadrao implements PessoaRegra {

	@Override
	public String salvar() {
		// TODO Auto-generated method stub
		return "Testanto o salvar pessoa";
	}
}
