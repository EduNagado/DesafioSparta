package com.DesafioSparta.Eduardo.controller;

import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaRequest;
import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaResponse;
import com.DesafioSparta.Eduardo.service.NegociacaoDiariaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/NegociacaoDiaria")
public class NegociacaoDiariaController {

    @Autowired
    private NegociacaoDiariaService negociacaoDiariaService;

    @PostMapping
    public ResponseEntity<NegociacaoDiariaResponse> createCota(@Valid @RequestBody NegociacaoDiariaRequest cota){
        return new ResponseEntity<>(negociacaoDiariaService.save(cota), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<NegociacaoDiariaResponse>>readCotas(@RequestParam(defaultValue = "0") Integer pageNumber){
        Pageable pageable = PageRequest
                .of(pageNumber, 2, Sort.by("id").ascending());
        return new ResponseEntity<>(negociacaoDiariaService.findAll(pageable), HttpStatus.OK);
    }


}
