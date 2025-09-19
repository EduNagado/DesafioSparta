package com.DesafioSparta.Eduardo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.apache.logging.log4j.message.Message;

public record PosicaoDiariaRequest(
       @NotNull(message = "O id do Cotista é obrigatorio") Long idCotista,
       @NotNull(message = "O id da Cota é obrigatorio") Long idCota,
       @Min(1)
       @NotNull (message = "A quantidade de Cotas é obrigatoria") int quantidade
) {
}
