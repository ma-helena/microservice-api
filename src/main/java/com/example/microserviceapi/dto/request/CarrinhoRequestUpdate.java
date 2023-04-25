package com.example.microserviceapi.dto.request;

import com.example.microserviceapi.model.Produto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;
@Slf4j
@AllArgsConstructor
public record CarrinhoRequestUpdate(
        String id, List<Produto> produto, int quantidade, BigDecimal valor) {
}
