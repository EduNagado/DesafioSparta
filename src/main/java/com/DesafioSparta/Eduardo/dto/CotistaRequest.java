package com.DesafioSparta.Eduardo.dto;

import jakarta.validation.constraints.NotBlank;

public record CotistaRequest(
        @NotBlank(message = "O nome do Cotista (investidor) é obrigatorio." ) String nome
) {
}
