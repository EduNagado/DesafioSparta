package com.DesafioSparta.Eduardo.dto;

import java.math.BigDecimal;

public record TaxaResponse(
    double percentual,
    String nome
) {
}
