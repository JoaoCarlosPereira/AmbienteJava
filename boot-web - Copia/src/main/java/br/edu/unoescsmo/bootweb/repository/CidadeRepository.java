package br.edu.unoescsmo.bootweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoescsmo.bootweb.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	

}
