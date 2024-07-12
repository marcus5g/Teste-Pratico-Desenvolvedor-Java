package com.teste.pratico;

import com.teste.pratico.DAO.AgendamentoDAO;
import com.teste.pratico.DAO.SolicitantesDAO;
import com.teste.pratico.DAO.VagasDAO;
import com.teste.pratico.entity.Agendamento;
import com.teste.pratico.entity.Solicitante;
import com.teste.pratico.entity.Vagas;
import lombok.Getter;
import lombok.Setter;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ManagedBean(name = "gestaoBean")
@SessionScoped
public class GestaoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Vagas vagas = new Vagas();
    private Solicitante solicitante = new Solicitante();
    private Agendamento agendamento = new Agendamento();
    private List<Vagas> vagasList = new ArrayList<>();
    private List<Agendamento> agendamentosList = new ArrayList<>();
    private List<Solicitante> solicitanteList = new ArrayList<>();
    private VagasDAO vagasDAO = new VagasDAO();
    private SolicitantesDAO solicitantesDAO = new SolicitantesDAO();
    private AgendamentoDAO agendamentoDAO = new AgendamentoDAO();

    public String salvarVagas() throws SQLException {
        vagasList.add(vagas);
        new VagasDAO().salvar(vagas);
        return  "index.xhtml?faces-redirect=true";
    }
    public String salvarAgendamento() throws SQLException {
        agendamentosList.add(agendamento);
        new AgendamentoDAO().salvar(agendamento);
        return  "index.xhtml?faces-redirect=true";
    }

    public String salvarSolicitante()throws SQLException {
        solicitanteList.add(solicitante);
        new SolicitantesDAO().salvar(solicitante);
        return  "index.xhtml?faces-redirect=true";
    }

    public void listarAgendamentoTotal() throws SQLException {
        agendamentosList = agendamentoDAO.buscarTotal();
    }
    public void listarAgendamentoSolicitante() throws SQLException {
        agendamentosList = agendamentoDAO.buscarSolicitante();
    }


    public GestaoBean(){}
}
