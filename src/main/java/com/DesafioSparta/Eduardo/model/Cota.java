package com.DesafioSparta.Eduardo.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Cota {
    private long id;
    private LocalDate data = LocalDate.now();
    private BigDecimal valorCotaAtual;
    private List<PosicaoDiaria> posicao;

    public long getId() {
        return id;
    }

    public BigDecimal getCotaAtual() {
        return valorCotaAtual;
    }

    public LocalDate getData() {
        return data;
    }

    public void setValorCotaAtual(BigDecimal valorCotaAtual) {
        this.valorCotaAtual = valorCotaAtual;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cota{");
        sb.append("id=").append(id);
        sb.append(", data=").append(data);
        sb.append(", CotaAtual=").append(valorCotaAtual);
        sb.append('}');
        return sb.toString();
    }
}
