package com.example.microserviceapi.model;

import java.math.BigDecimal;

public record Produto(String id, String nome, BigDecimal preco) {
}
