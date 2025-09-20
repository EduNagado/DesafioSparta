package com.DesafioSparta.Eduardo.controller;


import com.DesafioSparta.Eduardo.dto.TaxaPorCotistaResponse;
import com.DesafioSparta.Eduardo.service.CalculoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "/Calculo")
public class CalculoController {

    private CalculoService calculoService;

    @Autowired
    public CalculoController(CalculoService calculoService) {
        this.calculoService = calculoService;
    }


    
    @GetMapping
    public List<TaxaPorCotistaResponse> calcular(@RequestParam Long taxaId) {
        return calculoService.calcularTaxas(taxaId);
    }
}
