package com.DesafioSparta.Eduardo.model;

import java.util.List;

public class Cotista {
    private Long id;
    private String nome;

    private List<PosicaoDiaria> posicao;

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
