package com.teste.pratico.jpautil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoManeger {

    private static Connection conexao;
    private static final String url = "jdbc:hsqldb:file:/home/marcus/Teste/Teste-Pratico-Desenvolvedor-Java/database/mydb";
    private static final String user = "root";
    private static final String password = "root";

    public static Connection getConexao() {
        if (conexao == null) {
            try{
                Class.forName("org.hsqldb.jdbcDriver");
                conexao = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return conexao;
    }

    public static void closeConexao() {
        try{
                conexao.close();
                conexao = null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
