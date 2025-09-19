package com.DesafioSparta.Eduardo.model;

public class PosicaoDiaria {
    private long id;
    private Cotista cotista;
    private Cota cota;
    private int quantidade;


    public long getId() {
        return id;
    }

    public Cotista getCotista() {
        return cotista;
    }

    public Cota getCota() {
        return cota;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PosicaoDiaria{");
        sb.append("id=").append(id);
        sb.append(", cotista=").append(cotista);
        sb.append(", dia=").append(cota);
        sb.append(", quantidade=").append(quantidade);
        sb.append('}');
        return sb.toString();
    }
}
