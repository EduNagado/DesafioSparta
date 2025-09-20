package com.DesafioSparta.Eduardo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record TaxaRequest(
        @NotNull(message = "O Porcentual da taxa  é obrigatorio. ") double percentual,
        @NotBlank(message = "O nome para a taxa é obrigatorio. ") String nome
) {
}
