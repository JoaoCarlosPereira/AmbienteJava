package br.edu.unoescsmo.bootweb.regras;

import java.util.List;

import br.edu.unoescsmo.bootweb.model.Escalacao;
import br.edu.unoescsmo.bootweb.model.Pessoa;

public interface EscalacaoRegra {
	void salvar(Escalacao confronto);

	void delete(Escalacao confronto);
}
