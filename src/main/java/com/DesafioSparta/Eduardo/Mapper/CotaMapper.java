package com.DesafioSparta.Eduardo.Mapper;

import com.DesafioSparta.Eduardo.dto.CotaRequest;
import com.DesafioSparta.Eduardo.dto.CotaResponse;
import com.DesafioSparta.Eduardo.model.Cota;

public class CotaMapper {

    public Cota requestCota (CotaRequest cotaRequest){
        Cota cota = new Cota();
        cota.setValorCotaAtual(cotaRequest.valorCotaAtual());

        return cota;
    }

    public CotaResponse responseCota (Cota cota){
        return new CotaResponse(
                cota.getId(),
                cota.getData(),
                cota.getCotaAtual()
        );
    }
}
