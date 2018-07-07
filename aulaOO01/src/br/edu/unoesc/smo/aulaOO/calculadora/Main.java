package br.edu.unoesc.smo.aulaOO.calculadora;

public class Main {

	public void imprimeResultado(Operacao operacao, int valor1, int valor2) {
		System.out.println("Resultado: " + operacao.calcular(valor1, valor2));
	}

	public static void main(String[] args) {
			Main main = new Main();
			main.imprimeResultado(new Soma(), 10, 20);
			main.imprimeResultado(new Subtracao(), 10, 20);
	}

}
