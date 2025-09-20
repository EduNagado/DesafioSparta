package com.DesafioSparta.Eduardo.service;

import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaResponse;
import com.DesafioSparta.Eduardo.dto.TaxaResponse;
import com.DesafioSparta.Eduardo.model.NegociacaoDiaria;
import com.DesafioSparta.Eduardo.model.Taxa;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculoService {

    public BigDecimal valorDoDia(NegociacaoDiariaResponse negociacaoDiaria){
        return negociacaoDiaria.cota()
                .getCotaAtual()
                .multiply(BigDecimal.valueOf(negociacaoDiaria.quantidade()));

    }

    public BigDecimal calcularTaxa (NegociacaoDiariaResponse negociacaoDiaria, TaxaResponse taxa){
        BigDecimal valorDia = valorDoDia(negociacaoDiaria);
        return valorDia.multiply(BigDecimal.valueOf(taxa.percentual()));
    }

    public  BigDecimal calcularTaxaDiaria (NegociacaoDiariaResponse negociacaoDiaria, TaxaResponse taxa){
        BigDecimal taxaDiaria = calcularTaxa(negociacaoDiaria, taxa);
        return taxaDiaria.divide(BigDecimal.valueOf(252), 2, RoundingMode.HALF_UP);
    }
}
