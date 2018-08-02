package br.edu.unoescsmo.bootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.bootweb.model.Escalacao;

public interface EscalacaoRepository extends JpaRepository<Escalacao, Long> {
	@Query("select e from Escalacao e")
	List<Escalacao> dadosGrid();
}
