package com.DesafioSparta.Eduardo.Mapper;

import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaRequest;
import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaResponse;
import com.DesafioSparta.Eduardo.model.Cota;
import com.DesafioSparta.Eduardo.model.Cotista;
import com.DesafioSparta.Eduardo.model.NegociacaoDiaria;
import com.DesafioSparta.Eduardo.repository.CotaRepository;
import com.DesafioSparta.Eduardo.repository.CotistaRepository;
import org.springframework.stereotype.Component;

@Component
public class NegociacaoDiariaMapper {
    private final CotistaRepository cotistaRepository;
    private final CotaRepository cotaRepository;


    public NegociacaoDiariaMapper(CotistaRepository cotistaRepository, CotaRepository cotaRepository) {
        this.cotistaRepository = cotistaRepository;
        this.cotaRepository = cotaRepository;
    }

    public NegociacaoDiaria requestNegociacaoDiaria(NegociacaoDiariaRequest negociacaoDiariaRequest) {
        NegociacaoDiaria negociacao = new NegociacaoDiaria();
        negociacao.setQuantidade(negociacaoDiariaRequest.quantidade());


        Cotista cotista = cotistaRepository.findById(negociacaoDiariaRequest.idCotista()).get();
        Cota cota = cotaRepository.findById(negociacaoDiariaRequest.idCota()).get();

        negociacao.setCotista(cotista);
        negociacao.setCota(cota);

        return negociacao;
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
