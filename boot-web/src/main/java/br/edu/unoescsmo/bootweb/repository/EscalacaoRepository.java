package br.edu.unoescsmo.bootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.unoescsmo.bootweb.model.Escalacao;
import br.edu.unoescsmo.bootweb.model.Jogador;
import br.edu.unoescsmo.bootweb.model.Pessoa;

public interface EscalacaoRepository extends JpaRepository<Escalacao, Long> {
	@Query("select e from Escalacao e where e.jogador = :jogador")
	Escalacao EscalacaoPorJogador(@Param("jogador") Long jogador);
}
