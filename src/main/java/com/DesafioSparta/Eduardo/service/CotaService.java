package com.DesafioSparta.Eduardo.service;

import com.DesafioSparta.Eduardo.Mapper.CotaMapper;
import com.DesafioSparta.Eduardo.dto.CotaRequest;
import com.DesafioSparta.Eduardo.dto.CotaResponse;
import com.DesafioSparta.Eduardo.model.Cota;
import com.DesafioSparta.Eduardo.repository.CotaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CotaService {
   private final CotaRepository cotaRepository;
   private final CotaMapper cotaMapper = new CotaMapper();

   @Autowired
    public CotaService(CotaRepository cotaRepository) {
        this.cotaRepository = cotaRepository;
    }

    public CotaResponse save(CotaRequest cotaRequest){
        return cotaMapper.responseCota(
                cotaRepository.save(cotaMapper.requestCota(cotaRequest)));
    }

    public Page<CotaResponse> findAll (Pageable pageable){
       return cotaRepository.findAll(pageable).map(cotaMapper::responseCota);
    }

}
