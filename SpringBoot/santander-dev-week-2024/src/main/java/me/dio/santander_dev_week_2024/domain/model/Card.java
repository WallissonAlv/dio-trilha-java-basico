package me.dio.santander_dev_week_2024.domain.model;

public class Card {
	
	// ATRIBUTOS -----------------------------------
	private String number;
	private Number limit;
	
	// METODOS ACESSORES ---------------------------
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Number getLimit() {
		return limit;
	}
	public void setLimit(Number limit) {
		this.limit = limit;
	}
}
