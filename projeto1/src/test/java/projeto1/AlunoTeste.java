package projeto1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AlunoTeste {

	@Test
	public void deveMudarParaMaiusculo() {
		Aluno aluno = new Aluno("Jo�o");
		assertTrue(aluno.toUpperCase().equals("JO�O"));
	}
}
