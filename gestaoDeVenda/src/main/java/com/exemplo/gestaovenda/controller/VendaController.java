package com.exemplo.gestaovenda.controller;

import com.exemplo.gestaovenda.model.Venda;
import com.exemplo.gestaovenda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    public ResponseEntity<Venda> cadastrar(@RequestBody Venda venda) {

        Venda salva = vendaService.registrarVenda(venda);
        return new ResponseEntity<>(salva, HttpStatus.CREATED);
    }
}