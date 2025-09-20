package com.DesafioSparta.Eduardo.controller;

import com.DesafioSparta.Eduardo.dto.NegociacaoDiariaRequest;
import com.DesafioSparta.Eduardo.dto.TaxaRequest;
import com.DesafioSparta.Eduardo.model.NegociacaoDiaria;
import com.DesafioSparta.Eduardo.service.CalculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.util.List;

public class CalculoController {

    private CalculoService calculoService;

    @Autowired
    public CalculoController(CalculoService calculoService) {
        this.calculoService = calculoService;
    }

    @PostMapping("/calcular")
    public ResponseEntity<List<BigDecimal>> calcularTaxa(@RequestBody NegociacaoDiaria request) {
        List<BigDecimal> resultado = calculoService.calcularTaxaDiaria(request);
        return ResponseEntity.ok(resultado);
    }
}
