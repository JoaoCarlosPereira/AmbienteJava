package br.edu.unoescsmo.bootweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.unoescsmo.bootweb.regras.PessoaRegra;

@Controller
public class IndexController {

	@Autowired
	private PessoaRegra pessoaRegra;

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Testando controller";
	}

	@GetMapping("/salvarPessoa")
	@ResponseBody
	public String salvarPessoa() {
		return pessoaRegra.salvar();
	}
}
