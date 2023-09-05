package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProdutoDAO {
	public Connection minhaConexao;
	
	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	public String inserir(Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("insert into T_FIAP_PRODUTO values (?,?,?,?,?)");
		stmt.setInt(1, produto.getCodigo());
		stmt.setString(2, produto.getTipo());
		stmt.setString(3, produto.getMarca());
		stmt.setDouble(4, produto.getValorVenda());
		stmt.setDouble(5, produto.getValorCompra());
		stmt.execute();
		stmt.close();
		return "Cadastrado com Sucesso";
	}
}
