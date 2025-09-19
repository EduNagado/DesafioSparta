package com.DesafioSparta.Eduardo.service;

import com.DesafioSparta.Eduardo.Mapper.NegociacaoDiariaMapper;
import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaRequest;
import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaResponse;
import com.DesafioSparta.Eduardo.repository.NegociacaoDiariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class NegociacaoDiariaService {

    private final NegociacaoDiariaRepository negociacaoDiariaRepository;
    private final NegociacaoDiariaMapper negociacaoDiariaMapper = new NegociacaoDiariaMapper();

    @Autowired
    public NegociacaoDiariaService(NegociacaoDiariaRepository negociacaoDiariaRepository) {
        this.negociacaoDiariaRepository = negociacaoDiariaRepository;
    }

    public NegociacaoDiariaResponse save (NegociacaoDiariaRequest negociacaoDiariaRequest){
        return negociacaoDiariaMapper.responseNegociacaoDiaria(
                negociacaoDiariaRepository.save(negociacaoDiariaMapper.requestNegociacaoDiaria(negociacaoDiariaRequest))
        );
    }

    public Page<NegociacaoDiariaResponse> findAll(Pageable pageable){
        return negociacaoDiariaRepository.findAll(pageable).map(negociacaoDiariaMapper::responseNegociacaoDiaria);
    }
}
