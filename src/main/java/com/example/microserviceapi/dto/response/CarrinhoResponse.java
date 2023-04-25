package com.example.microserviceapi.dto.response;

import com.example.microserviceapi.model.Produto;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public record CarrinhoResponse (String id, List<Produto> produto, BigDecimal valor){

}
