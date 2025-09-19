package com.DesafioSparta.Eduardo.service;

import com.DesafioSparta.Eduardo.model.NegociacaoDiaria;
import com.DesafioSparta.Eduardo.model.Taxa;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculoService {

    public BigDecimal valorDoDia(NegociacaoDiaria negociacaoDiaria){
        return negociacaoDiaria.getCota()
                .getCotaAtual()
                        .multiply(BigDecimal.valueOf(negociacaoDiaria.getQuantidade()));

    }

    public BigDecimal calcularTaxa (NegociacaoDiaria negociacaoDiaria, Taxa taxa){
        BigDecimal valorDia = valorDoDia(negociacaoDiaria);
        return valorDia.multiply(BigDecimal.valueOf(taxa.getPercentual()));
    }

    public  BigDecimal calcularTaxaDiaria (NegociacaoDiaria negociacaoDiaria, Taxa taxa){
        BigDecimal taxaDiaria = calcularTaxa(negociacaoDiaria, taxa);
        return taxaDiaria.divide(BigDecimal.valueOf(252), 2, RoundingMode.HALF_UP);
    }
}
