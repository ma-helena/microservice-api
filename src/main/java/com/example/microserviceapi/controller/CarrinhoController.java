package com.example.microserviceapi.controller;

import com.example.microserviceapi.service.CarrinhoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/carrinho")
public class CarrinhoController {
    private CarrinhoService carrinhoService;
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Mono<ResponseEntity><Carrinho> salvar(@RequestBody Carrinho carrinho)




}