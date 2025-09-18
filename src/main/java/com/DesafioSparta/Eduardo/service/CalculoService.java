package com.DesafioSparta.Eduardo.service;

import com.DesafioSparta.Eduardo.model.PosicaoDiaria;
import com.DesafioSparta.Eduardo.model.Taxa;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculoService {

    public BigDecimal valorDoDia(PosicaoDiaria posicaoDiaria){
        return posicaoDiaria.getDia()
                .getCotaAtual()
                        .multiply(BigDecimal.valueOf(posicaoDiaria.getQuantidade()));

    }

    public BigDecimal calcularTaxa ( PosicaoDiaria posicaoDiaria, Taxa taxa){
        BigDecimal valorDia = valorDoDia(posicaoDiaria);
        return valorDia.multiply(BigDecimal.valueOf(taxa.getPercentual()));
    }

    public  BigDecimal calcularTaxaDiaria (PosicaoDiaria posicaoDiaria, Taxa taxa){
        BigDecimal taxaDiaria = calcularTaxa(posicaoDiaria, taxa);
        return taxaDiaria.divide(BigDecimal.valueOf(252), 2, RoundingMode.HALF_UP);
    }
}
