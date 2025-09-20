package com.DesafioSparta.Eduardo.controller;



import com.DesafioSparta.Eduardo.dto.CotistaRequest;
import com.DesafioSparta.Eduardo.dto.CotistaResponse;
import com.DesafioSparta.Eduardo.service.CotistaService;
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
@RequestMapping(value = "/cotista")
public class CotistaController {

    @Autowired
    private CotistaService cotistaService;

    @PostMapping
    public ResponseEntity<CotistaResponse> createCota(@Valid @RequestBody CotistaRequest cota){
        return new ResponseEntity<>(cotistaService.save(cota), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<CotistaResponse>>readCotas(@RequestParam(defaultValue = "0") Integer pageNumber){
        Pageable pageable = PageRequest
                .of(pageNumber, 2, Sort.by("id").ascending());
        return new ResponseEntity<>(cotistaService.findAll(pageable), HttpStatus.OK);
    }
}
