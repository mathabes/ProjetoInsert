package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteCadastro {
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
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProdutoDAO dao = new ProdutoDAO();
		Produto objProduto = new Produto();
		
		objProduto.setCodigo(inteiro("Codigo"));
		objProduto.setTipo(texto("Tipo do produto"));
		objProduto.setMarca(texto("Marca do produto"));
		objProduto.setValorVenda(real("Valor da venda"));
		objProduto.setValorCompra(real("Valor da compra"));
		
		System.out.println(dao.inserir(objProduto));
	}

}
