package com.DesafioSparta.Eduardo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "negociacaoDiaria")
public class NegociacaoDiaria {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "negociacaoDiaria_seq")
    @SequenceGenerator(name = "negociacaoDiaria_seq", sequenceName = "NEGOCIACAODIARIA_SEQ", allocationSize = 1)
    private long id;

    @ManyToOne
    @JoinColumn(name = "cotista_id")
    private Cotista cotista;


    @ManyToOne
    @JoinColumn(name = "cota_id")
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


    public void setCotista(Cotista cotista) {
        this.cotista = cotista;
    }

    public void setCota(Cota cota) {
        this.cota = cota;
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
