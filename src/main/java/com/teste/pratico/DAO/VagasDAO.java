package com.teste.pratico.DAO;

import com.teste.pratico.entity.Vagas;
import com.teste.pratico.jpautil.ConexaoManeger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VagasDAO {

    public void salvar(Vagas vagas) throws SQLException {
        Connection conexao = ConexaoManeger.getConexao();
        PreparedStatement s = conexao.prepareCall("INSERT INTO VAGAS (INICIO, FIM,QUANTIDADE) VALUES (?, ?, ?)");
        s.setDate(1, (Date) vagas.getDataInicio());
        s.setDate(2, (Date) vagas.getDataFim());
        s.setLong(3, vagas.getQuantidade());
        ConexaoManeger.closeConexao();
    }

}
