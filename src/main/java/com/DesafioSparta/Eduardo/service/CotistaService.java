package com.DesafioSparta.Eduardo.service;

import com.DesafioSparta.Eduardo.Mapper.CotistaMapper;
import com.DesafioSparta.Eduardo.dto.CotistaRequest;
import com.DesafioSparta.Eduardo.dto.CotistaResponse;
import com.DesafioSparta.Eduardo.repository.CotistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CotistaService {
    private final CotistaRepository cotistaRepository;
    private final CotistaMapper cotistaMapper = new CotistaMapper();

    @Autowired
    public CotistaService(CotistaRepository cotistaRepository) {
        this.cotistaRepository = cotistaRepository;
    }

    public CotistaResponse save (CotistaRequest cotistaRequest){
        return cotistaMapper.responseCotista(
                cotistaRepository.save(cotistaMapper.requestCotista(cotistaRequest)));
    }

    public Page<CotistaResponse> findAll(Pageable pageable){
        return cotistaRepository.findAll(pageable).map(cotistaMapper::responseCotista);
    }
}
