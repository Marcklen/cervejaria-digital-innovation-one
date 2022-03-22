package com.dio.cervejaria.mapper;

import org.mapstruct.factory.Mappers;

import com.dio.cervejaria.dto.BeerDTO;
import com.dio.cervejaria.entity.Beer;

public interface BeerMapper {

	BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);
	
	Beer toModel(BeerDTO beerDTO);
	
	BeerDTO toDTO(Beer beer);
}
