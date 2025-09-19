package com.DesafioSparta.Eduardo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record TaxaRequest(
        @NotNull(message = "O Porcentual da taxa de administração é obrigatorio. ") @DecimalMin("0.0") BigDecimal percentual
) {
}
