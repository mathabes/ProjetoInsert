package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecoes.Excecao;

public class TesteProduto {
	public static String texto(String message) {
        return JOptionPane.showInputDialog(message);
    }

    // Método estático para receber uma entrada de int usando JOptionPane
    public static int inteiro(String message) {
        String input = JOptionPane.showInputDialog(message);
        return Integer.parseInt(input);
    }

    // Método estático para receber uma entrada de double usando JOptionPane
    public static double real(String message) {
        String input = JOptionPane.showInputDialog(message);
        return Double.parseDouble(input);
    }

	public static void main(String[] args) throws Exception{
		Produto objProduto = new Produto();
		try {
			objProduto.setCodigo(inteiro("Codigo"));
		} catch (Exception e) {
			throw new Excecao(e);
		} finally {
			
		}
		System.out.println("Código: " + objProduto.getCodigo());

	}

}
