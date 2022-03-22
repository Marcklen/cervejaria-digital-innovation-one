package com.dio.cervejaria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class BeerNotFoundException extends Exception {

	public BeerNotFoundException(String beerName) {
		super(String.format("A cerveja com o nome %s não foi encontrada no sistema!", beerName));
	}

	public BeerNotFoundException(Long id) {
		super(String.format("A cerveja com id %s não foi encontrada no sistema!", id));
	}
}
