package com.DesafioSparta.Eduardo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record CotaRequest(
       @NotNull(message = "O valor atual da cota é obrigatorio") @DecimalMin("0.0") BigDecimal valorCotaAtual
) {
}
