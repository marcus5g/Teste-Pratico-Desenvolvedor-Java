package com.teste.pratico.DAO;

import com.teste.pratico.entity.Agendamento;
import com.teste.pratico.jpautil.ConexaoManeger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoDAO {

    public List<Agendamento> salvar(Agendamento ag) throws SQLException {
        Connection conexao = ConexaoManeger.getConexao();
        PreparedStatement s = conexao.prepareCall("INSERT INTO Agendamento (DATA, NUMERO, MOTIVO, SOLICITANTE_ID) VALUES (?, ?, ?, ?)");
        s.setDate(1, (Date) ag.getData());
        s.setString(2, ag.getNumero());
        s.setString(3, ag.getMotivo());
        s.setLong(4, ag.getId());
        ConexaoManeger.closeConexao();
        return List.of();
    }

    public List<Agendamento> buscarTotal() {
        List<Agendamento> agendamentoList = new ArrayList<>();
        try {
            Connection connection = ConexaoManeger.getConexao();
            PreparedStatement stmt = connection.prepareStatement("select * from AGENDAMENTO where DATA = ?");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Agendamento agendamento = new Agendamento();
                agendamento.setId(rs.getLong("id"));
                agendamento.setData(rs.getDate("dataInicio"));
                agendamento.setNumero(rs.getString("numero"));
                agendamento.setMotivo(rs.getString("motivo"));
                agendamento.setIdSolicitante(rs.getLong("idSolicitante"));
                agendamentoList.add(agendamento);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return agendamentoList;
    }
    public List<Agendamento> buscarSolicitante() {
        List<Agendamento> agendamentoList = new ArrayList<>();
        try {
            Connection connection = ConexaoManeger.getConexao();
            PreparedStatement stmt = connection.prepareStatement("select * from AGENDAMENTO where SOLICITANTE_ID = ? and DATA = ?");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Agendamento agendamento = new Agendamento();
                agendamento.setId(rs.getLong("id"));
                agendamento.setData(rs.getDate("dataInicio"));
                agendamento.setNumero(rs.getString("numero"));
                agendamento.setMotivo(rs.getString("motivo"));
                agendamento.setIdSolicitante(rs.getLong("idSolicitante"));
                agendamentoList.add(agendamento);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return agendamentoList;
    }
}
