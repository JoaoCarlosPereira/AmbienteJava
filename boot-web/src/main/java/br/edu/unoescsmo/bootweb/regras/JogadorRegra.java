package br.edu.unoescsmo.bootweb.regras;

import br.edu.unoescsmo.bootweb.model.Jogador;
import br.edu.unoescsmo.bootweb.model.Time;

public interface JogadorRegra {
	void salvar(Jogador jogador);

	void delete(Jogador jogador);
	
	Jogador buscarJogador(Long codigo);
}
