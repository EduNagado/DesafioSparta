package com.DesafioSparta.Eduardo.service;

import com.DesafioSparta.Eduardo.Mapper.TaxaMapper;
import com.DesafioSparta.Eduardo.dto.TaxaRequest;
import com.DesafioSparta.Eduardo.dto.TaxaResponse;
import com.DesafioSparta.Eduardo.model.Taxa;
import com.DesafioSparta.Eduardo.repository.TaxaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaxaService {
    private final TaxaRepository taxaRepository;
    private final TaxaMapper taxaMapper = new TaxaMapper();

    @Autowired
    public TaxaService(TaxaRepository taxaRepository) {
        this.taxaRepository = taxaRepository;
    }

    public TaxaResponse save (TaxaRequest taxaRequest){
        return taxaMapper.responseTaxa(
                taxaRepository.save(taxaMapper.requestTaxa(taxaRequest)));
    }

    public Page<TaxaResponse> findAll (Pageable pageable){
        return taxaRepository.findAll(pageable).map(taxaMapper::responseTaxa);
    }
}
