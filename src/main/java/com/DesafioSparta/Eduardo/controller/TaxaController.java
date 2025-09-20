package com.DesafioSparta.Eduardo.controller;

import com.DesafioSparta.Eduardo.dto.TaxaRequest;
import com.DesafioSparta.Eduardo.dto.TaxaResponse;
import com.DesafioSparta.Eduardo.service.TaxaService;
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
@RequestMapping(value = "/taxa")
public class TaxaController {

    @Autowired
    private TaxaService taxaService;

    @PostMapping
    public ResponseEntity<TaxaResponse> createCota(@Valid @RequestBody TaxaRequest cota){
        return new ResponseEntity<>(taxaService.save(cota), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<TaxaResponse>>readCotas(@RequestParam(defaultValue = "0") Integer pageNumber){
        Pageable pageable = PageRequest
                .of(pageNumber, 2, Sort.by("id").ascending());
        return new ResponseEntity<>(taxaService.findAll(pageable), HttpStatus.OK);
    }
}
