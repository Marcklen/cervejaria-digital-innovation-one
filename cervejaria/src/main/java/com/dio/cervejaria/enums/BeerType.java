package com.dio.cervejaria.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

	LAGER("Lager"),
	PILSEN("Pilsen"),
	MALZBIER("Malzbier"),
	WITBIER("Witbier"),
	WEISS("Weiss"),
	ALE("Ale"),
	IPA("Ipa"),
	STOUT("Stout");
	
	private final String description;
}
