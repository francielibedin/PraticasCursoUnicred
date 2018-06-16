package br.com.unicred;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExemploConsultaBancoDados {
	
//	em projetos add um try, cate para cada caso, neste exemplo vamos deixar "estourar" por isso o throws SQLException no mais
	public static void main(String[] args) throws SQLException {
		
//		Passo 1: preparar a CONEXÃO
		String conexaoBD = "jdbc:sqlserver://UBR-RS-1449\\SQLEXPRESS; databasename=DB_CURSO_UNICRED; USER= sa; PASSWORD=bedin123";
		Connection conexao = DriverManager.getConnection(conexaoBD);
		
//		quando for conectar sem o usuário e senha
//		String conexaoBD = "SERVER=UBR-RS-1449\\SQLEXPRESS; DATABASE=DB_CURSO_UNICRED; PERSIST SECURITY INFO=TRUE";
//		Connection conexao = DriverManager.getConnection(conexaoBD);
				
//		Passo 2: preparar o COMANDO
		String comandoSQL = "select * from DBO.CLIENTE";
		PreparedStatement comando = conexao.prepareStatement(comandoSQL);
				
//		Passo 3: EXECUTAR o comando
		ResultSet leitor = comando.executeQuery();
		
		while (leitor.next()) {
			System.out.println("Nome: " +leitor.getString("NM_CLIENTE"));
		}
		
//		Passo 4: Fechar tudo
		leitor.close();
		comando.close();
		conexao.close();
	}

}
