package br.com.unicred;
import java.sql.*;

public class ExemploProcedureBD {
	
	public static void main(String[] args) throws SQLException{
		
//		Passo 1: preparar a CONEXÃO
		String conexaoBD = "jdbc:sqlserver://UBR-RS-1449\\SQLEXPRESS; databasename=DB_CURSO_UNICRED; USER= sa; PASSWORD=bedin123";
		Connection conexao = DriverManager.getConnection(conexaoBD);
						
//		Passo 2: preparar o COMANDO
		String procedure = "{call DBO.PR_INS_CLIENTE (?, ?, ?, ?)}";
		CallableStatement comando = conexao.prepareCall(procedure);
//		Parâmetros de entrada
		comando.setInt(1, 33);
		comando.setString(2, "Francieli");
		comando.setString(3, "Centro Porto Alegre");
//		Parâmetros de saída
		comando.registerOutParameter(4, Types.VARCHAR);
				
//		Passo 3: EXECUTAR o comando
		comando.executeUpdate();
		
		String mensagem = comando.getString(4);
		
		System.out.println(mensagem);
		
//		Passo 4: Fechar tudo
		comando.close();
		conexao.close();
	}

}
