package com.example.microserviceapi.service;

import com.example.microserviceapi.dto.request.CarrinhoRequestUpdate;
import com.example.microserviceapi.dto.response.CarrinhoResponse;
import com.example.microserviceapi.mapper.CarrinhoMapper;
import com.example.microserviceapi.model.Carrinho;
import com.example.microserviceapi.repository.CarrinhoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarrinhoService {
    private final CarrinhoRepository carrinhoRepository;
    private final CarrinhoMapper carrinhoMapper;


    public Mono<Carrinho> salvar(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);

    }

    public Flux<Carrinho> listar() {
        return carrinhoRepository.findAll();
    }

public Mono<CarrinhoResponse> atualizar(String id, CarrinhoRequestUpdate carrinhoRequestUpdate) {
    var carrinho = carrinhoRepository.findById(id);
    var novoCarrinho = carrinho.block().builder().produto(carrinhoRequestUpdate.produto())
            .quantidade(carrinhoRequestUpdate.quantidade())
            .valor(carrinhoRequestUpdate.valor())
            .build();

    return Mono.just(carrinhoMapper.carrinhoToCarrinhoResponse(novoCarrinho));

}}
