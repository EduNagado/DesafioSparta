package com.DesafioSparta.Eduardo.Mapper;

import com.DesafioSparta.Eduardo.dto.CotistaRequest;
import com.DesafioSparta.Eduardo.dto.CotistaResponse;
import com.DesafioSparta.Eduardo.model.Cotista;

public class CotistaMapper {
    public Cotista requestCotista (CotistaRequest cotistaRequest){
        Cotista cotista = new Cotista();
        cotista.setNome(cotistaRequest.nome());
        return  cotista;
    }
    public CotistaResponse responseCotista (Cotista cotista){
        return new CotistaResponse(
                cotista.getId(),
                cotista.getNome()
        );
    }

}
