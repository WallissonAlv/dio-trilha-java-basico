package me.dio.santander_dev_week_2024.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {
	
	// ATRIBUTOS -----------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	@Column(name = "available_limit",precision = 13, scale = 13)
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
