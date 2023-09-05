package br.com.fiap.excecoes;

public class Excecao extends Exception {
	public Excecao() {
		super();
	}
	public Excecao(Exception e) {
		super();
		if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Digite um número válido");
		}else {
			System.out.println("Falha desconhecida");
			e.printStackTrace();
		}
	}
}
