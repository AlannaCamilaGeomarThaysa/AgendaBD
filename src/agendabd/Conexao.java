package agendabd;

import java.sql.*;

public class Conexao {

    static Connection conn;

    static Connection getConexao() {

        String driver = "com.mysql.jdbc.Driver"; 
        String banco = "agenda"; 
        String host = "localhost"; 
        String str_conn = "jdbc:mysql://" + host + ":3307/" + banco; //URL de conex�o
        String usuario = "root"; 
        String senha = "usbw";

        try {
            Class.forName(driver); //Carrega o driver

            conn = DriverManager.getConnection(str_conn, usuario, senha);

            System.out.println("CONECTOU! :)");

        } catch (Exception ex) {

            System.out.println("ERRO!");
            ex.printStackTrace();

        } // fim do try-catch
        
        return conn;   // envia a conexao pra quem solicitou

    } // fim de getConexao()
       
    
} // fim de Conexao
