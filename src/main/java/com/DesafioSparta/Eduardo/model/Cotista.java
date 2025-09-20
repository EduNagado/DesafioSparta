package com.DesafioSparta.Eduardo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="cotista")
public class Cotista {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cotista_seq")
    @SequenceGenerator(name = "cotista_seq", sequenceName = "COTISTA_SEQ", allocationSize = 1)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "cotista")
    private List<NegociacaoDiaria> posicao;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cotista{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
