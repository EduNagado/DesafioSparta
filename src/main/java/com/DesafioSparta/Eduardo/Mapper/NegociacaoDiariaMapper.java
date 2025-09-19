package com.DesafioSparta.Eduardo.Mapper;

import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaRequest;
import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaResponse;
import com.DesafioSparta.Eduardo.model.NegociacaoDiaria;

public class NegociacaoDiariaMapper {

    public NegociacaoDiaria requestNegociacaoDiaria (NegociacaoDiariaRequest negociacaoDiariaRequest){
        NegociacaoDiaria negociacaoDiaria = new NegociacaoDiaria();
        negociacaoDiaria.setQuantidade(negociacaoDiariaRequest.quantidade());
        return negociacaoDiaria;
    }

    public NegociacaoDiariaResponse responseNegociacaoDiaria (NegociacaoDiaria negociacaoDiaria){
        return new NegociacaoDiariaResponse(
                negociacaoDiaria.getId(),
                negociacaoDiaria.getCotista(),
                negociacaoDiaria.getCota(),
                negociacaoDiaria.getQuantidade()
        );
    }
}
