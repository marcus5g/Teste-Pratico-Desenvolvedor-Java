package com.teste.pratico.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Setter
@Getter
@Entity
public class Vagas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "SYS_PK_10093", sequenceName = "SYS_PK_10093")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "inicio", nullable = false)
    private Date dataInicio;

    @Column(name = "fim", nullable = false)
    private Date dataFim;

    @Column(name = "quantidade", nullable = false)
    private Long quantidade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vagas vagas = (Vagas) o;
        return Objects.equals(id, vagas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
