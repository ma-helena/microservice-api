package com.example.microserviceapi.repository;

import com.example.microserviceapi.model.Carrinho;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.util.List;

public interface CarrinhoRepository  extends ReactiveMongoRepository<Carrinho, String> {

    Flux<Carrinho> findByProdutoIn (List<String> produto);
}
