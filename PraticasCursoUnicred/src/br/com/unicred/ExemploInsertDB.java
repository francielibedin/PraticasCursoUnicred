package br.com.unicred;

import java.sql.*;

public class ExemploInsertDB {
	
	public static void main(String[] args) throws SQLException{
		
		String conexaoBD = "jdbc:sqlserver://UBR-RS-1449\\SQLEXPRESS; databasename=DB_CURSO_UNICRED; USER= sa; PASSWORD=bedin123";
		Connection conexao = DriverManager.getConnection(conexaoBD);
		
		String comandoSQL = "insert into cliente values (123, 'teste', 'rua b')";
		PreparedStatement comando = conexao.prepareStatement(comandoSQL);
		
		comando.executeUpdate();
		
		comando.close();
		conexao.close();

	}

}
