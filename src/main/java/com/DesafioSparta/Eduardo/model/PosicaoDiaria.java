package com.DesafioSparta.Eduardo.model;

import java.math.BigDecimal;

public class PosicaoDiaria {
    private long id;
    private Cotista cotista;
    private Cota dia;
    private int quantidade;

    public long getId() {
        return id;
    }

    public Cotista getCotista() {
        return cotista;
    }

    public Cota getDia() {
        return dia;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public PosicaoDiaria(long id, Cotista cotista, Cota dia, int quantidade) {
        this.id = id;
        this.cotista = cotista;
        this.dia = dia;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PosicaoDiaria{");
        sb.append("id=").append(id);
        sb.append(", cotista=").append(cotista);
        sb.append(", dia=").append(dia);
        sb.append(", quantidade=").append(quantidade);
        sb.append('}');
        return sb.toString();
    }
}
