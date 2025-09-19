package com.DesafioSparta.Eduardo.Mapper;

import com.DesafioSparta.Eduardo.dto.CotaResponse;
import com.DesafioSparta.Eduardo.dto.CotistaResponse;
import com.DesafioSparta.Eduardo.dto.PosicaoDiariaRequest;
import com.DesafioSparta.Eduardo.dto.PosicaoDiariaResponse;
import com.DesafioSparta.Eduardo.model.PosicaoDiaria;

public class PosicaoDiariaMapper {

    public PosicaoDiaria requestPosicaoDiaria (PosicaoDiariaRequest posicaoDiariaRequest){
        PosicaoDiaria posicaoDiaria = new PosicaoDiaria();
        posicaoDiaria.setQuantidade(posicaoDiariaRequest.quantidade());
        return  posicaoDiaria;
    }

    public PosicaoDiariaResponse responsePosicaoDiaria (PosicaoDiaria posicaoDiaria){
        return new PosicaoDiariaResponse(
                posicaoDiaria.getId(),
                posicaoDiaria.getCotista(),
                posicaoDiaria.getCota(),
                posicaoDiaria.getQuantidade()
        );
    }
}
