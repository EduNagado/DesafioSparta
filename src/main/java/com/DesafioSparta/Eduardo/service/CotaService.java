package com.DesafioSparta.Eduardo.service;

import com.DesafioSparta.Eduardo.repository.CotaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CotaService {
   private final CotaRepository cotaRepository;

   @Autowired
    public CotaService(CotaRepository cotaRepository) {
        this.cotaRepository = cotaRepository;
    }


}
