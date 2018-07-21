package br.edu.unoescsmo.bootweb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.unoescsmo.bootweb.model.Pessoa;
import br.edu.unoescsmo.bootweb.regras.PessoaRegra;
import br.edu.unoescsmo.bootweb.repository.CidadeRepository;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRegra pessoaRegra;
	
	@Autowired
	private CidadeRepository cidadeRepositary;

	@PostMapping("/salvar")
	public String salvar(@Valid Pessoa pessoa, BindingResult erros) {
		if(erros.hasErrors()) {
			return "pessoa/novo";
		}
		pessoaRegra.salvar(pessoa);
		return "redirect:/pessoa/listar";
	}

	
	@PostMapping("/alterar")
	public String alterar(@Valid Pessoa pessoa, BindingResult erros) {
		if(erros.hasErrors()) {
			return "pessoa/visualizar";
		}
		pessoaRegra.salvar(pessoa);
		return "redirect:/pessoa/listar";
	}
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
		// Torna a lista de pessoa acessivel no JSP
		model.addAttribute("pessoas", pessoaRegra.dadosGrid());
		// Caminho + nome do jsp que será renderizado na tela.
		return "pessoa/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("cidades", cidadeRepositary.findAll());
		return "pessoa/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		pessoaRegra.delete(new Pessoa(codigo));
		return "redirect:/pessoa/listar";

	}
	
	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("pessoa", pessoaRegra.buscarPessoa(codigo));
		model.addAttribute("cidades", cidadeRepositary.findAll());
		return "pessoa/visualizar";

	}	

	@GetMapping("/cpf/{cpf}")
	@ResponseBody
	public List<Pessoa> listarCpf(@PathVariable("cpf") String cpf) {
		return pessoaRegra.listarPorCPF(cpf);
	}

	@GetMapping("/nome/{nome}")
	@ResponseBody
	public List<Pessoa> listarNome(@PathVariable("nome") String nome) {
		return pessoaRegra.listarPorNome("%" + nome + "%");
	}

}
