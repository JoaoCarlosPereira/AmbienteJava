package br.edu.unoescsmo.bootweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoescsmo.bootweb.model.Jogador;
import br.edu.unoescsmo.bootweb.model.Pessoa;
import br.edu.unoescsmo.bootweb.regras.JogadorRegra;
import br.edu.unoescsmo.bootweb.repository.CidadeRepository;
import br.edu.unoescsmo.bootweb.repository.JogadorRepository;

@Controller
@RequestMapping("/jogador")
public class JogadorController {

	@Autowired
	private JogadorRegra jogadorRegra;
	
	@Autowired
	private JogadorRepository jogadorRepository;
	
	@PostMapping("/salvar")
	public String salvar(@Valid Jogador jogador, BindingResult erros) {
		if(erros.hasErrors()) {
			return "jogador/novo";
		}
		jogadorRegra.salvar(jogador);
		return "redirect:/jogador/novo";
	}
	
	@GetMapping("/novo")
	public String novo(Model model) {
		return "jogador/novo";
	}
	
	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		jogadorRegra.delete(new Jogador(codigo));
		return "redirect:/jogador/novo";
	}

}
