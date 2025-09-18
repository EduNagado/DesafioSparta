package com.DesafioSparta.Eduardo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cota {
    private long id;
    private LocalDate data;
    private BigDecimal ValorCotaAtual;

    public long getId() {
        return id;
    }

    public BigDecimal getCotaAtual() {
        return ValorCotaAtual;
    }

    public LocalDate getData() {
        return data;
    }



    public Cota(long id, LocalDate data, BigDecimal valorCotaAtual) {
        this.id = id;
        this.data = data;
        ValorCotaAtual = valorCotaAtual;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cota{");
        sb.append("id=").append(id);
        sb.append(", data=").append(data);
        sb.append(", CotaAtual=").append(ValorCotaAtual);
        sb.append('}');
        return sb.toString();
    }
}
