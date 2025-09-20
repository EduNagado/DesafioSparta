package com.DesafioSparta.Eduardo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cota")
public class Cota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cota_seq")
    @SequenceGenerator(name = "cota_seq", sequenceName = "COTA_SEQ", allocationSize = 1)
    private long id;
    private LocalDate data = LocalDate.now();
    private BigDecimal valorValorCotaAtual;

    @OneToMany(mappedBy = "cota")
    private List<NegociacaoDiaria> posicao;

    public long getId() {
        return id;
    }

    public BigDecimal getValorCotaAtual() {
        return valorValorCotaAtual;
    }

    public LocalDate getData() {
        return data;
    }

    public void setValorCotaAtual(BigDecimal valorCotaAtual) {
        this.valorValorCotaAtual = valorCotaAtual;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cota{");
        sb.append("id=").append(id);
        sb.append(", data=").append(data);
        sb.append(", CotaAtual=").append(valorValorCotaAtual);
        sb.append('}');
        return sb.toString();
    }
}
