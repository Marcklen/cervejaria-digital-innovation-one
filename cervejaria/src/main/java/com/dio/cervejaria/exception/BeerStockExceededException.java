package com.dio.cervejaria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockExceededException extends Exception {

    public BeerStockExceededException(Long id, int quantityToIncrement) {
        super(String.format("Cervejas com %s ID para adiçao informado excedem a capacidade máxima do estoque: %s", 
        		id, quantityToIncrement));
    }
}