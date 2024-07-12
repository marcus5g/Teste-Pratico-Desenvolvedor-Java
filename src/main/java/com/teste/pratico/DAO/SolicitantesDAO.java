package com.teste.pratico.DAO;

import com.teste.pratico.entity.Solicitante;
import com.teste.pratico.jpautil.ConexaoManeger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SolicitantesDAO {

    public void salvar(Solicitante sl) throws SQLException {
        Connection conexao = ConexaoManeger.getConexao();
        PreparedStatement s = conexao.prepareCall("INSERT INTO SOLICITANTE (NOME) VALUES (?)");
        s.setString(1, sl.getNome());
        ConexaoManeger.closeConexao();
    }
}
