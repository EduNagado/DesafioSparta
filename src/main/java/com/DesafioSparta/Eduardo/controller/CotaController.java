package com.DesafioSparta.Eduardo.controller;

import com.DesafioSparta.Eduardo.dto.CotaRequest;
import com.DesafioSparta.Eduardo.dto.CotaResponse;
import com.DesafioSparta.Eduardo.service.CotaService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cota")
public class CotaController {

    @Autowired
    private CotaService cotaService;

    @PostMapping
    public ResponseEntity<CotaResponse>createCota(@Valid @RequestBody CotaRequest cota){
        return new ResponseEntity<>(cotaService.save(cota), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<CotaResponse>>readCotas(@RequestParam(defaultValue = "0") Integer pageNumber){
        Pageable pageable = PageRequest
                .of(pageNumber, 2, Sort.by("id").ascending());
        return new ResponseEntity<>(cotaService.findAll(pageable), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> negDelete(@PathVariable Long id) {
        boolean deletado = cotaService.delete(id);
        if (!deletado) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
