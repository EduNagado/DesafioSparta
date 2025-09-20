package com.DesafioSparta.Eduardo.dto;

import com.DesafioSparta.Eduardo.model.Cota;
import com.DesafioSparta.Eduardo.model.Cotista;
import com.DesafioSparta.Eduardo.model.Taxa;

public record NegociacaoDiariaResponse(
        long id,
        Cotista cotista,
        Cota cota,
        int quantidade

) {
}
