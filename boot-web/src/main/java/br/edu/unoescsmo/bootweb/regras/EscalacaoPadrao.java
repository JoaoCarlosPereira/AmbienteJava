package br.edu.unoescsmo.bootweb.regras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.bootweb.model.Escalacao;
import br.edu.unoescsmo.bootweb.repository.EscalacaoRepository;

@Service
public class EscalacaoPadrao implements EscalacaoRegra {

	@Autowired
	private EscalacaoRepository escalacaoRepository;

	@Override
	public void salvar(Escalacao confronto) {
		escalacaoRepository.save(confronto);
	}

	@Override
	public void delete(Escalacao confronto) {
		escalacaoRepository.delete(confronto);
	}

}
