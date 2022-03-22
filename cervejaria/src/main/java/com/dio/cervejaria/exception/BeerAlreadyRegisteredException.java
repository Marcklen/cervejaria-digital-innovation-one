package com.dio.cervejaria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerAlreadyRegisteredException extends Exception{

	public BeerAlreadyRegisteredException(String beerName) {
		super(String.format("A Cerveja com o nome %s ja tem registro no sistema!", beerName));
		// TODO Auto-generated constructor stub
	}
	
}
