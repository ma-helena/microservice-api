package com.example.microserviceapi.mapper;

import com.example.microserviceapi.dto.request.CarrinhoRequestUpdate;
import com.example.microserviceapi.dto.response.CarrinhoResponse;
import com.example.microserviceapi.model.Carrinho;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarrinhoMapper {
    CarrinhoResponse carrinhoRequestToCarrinhoResponse(CarrinhoRequestUpdate carrinhoRequestUpdate);
    CarrinhoResponse carrinhoToCarrinhoResponse(Carrinho carrinho);
}
