package com.DesafioSparta.Eduardo.dto;

import java.math.BigDecimal;

public record TaxaPorCotistaResponse(
        String nomeCotista,
        BigDecimal valorTaxa
) {
}
