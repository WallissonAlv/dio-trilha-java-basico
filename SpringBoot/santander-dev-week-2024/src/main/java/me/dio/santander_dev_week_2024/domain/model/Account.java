package me.dio.santander_dev_week_2024.domain.model;

/* import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;*/

// @Entity(name = "tb_account")
public class Account {

	// ATRIBUTOS -----------------------------------
	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String agency;
	private Number balance;
	private Number limit;
	
	// METODOS ACESSORES ---------------------------
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public Number getBalance() {
		return balance;
	}
	public void setBalance(Number balance) {
		this.balance = balance;
	}
	public Number getLimit() {
		return limit;
	}
	public void setLimit(Number limit) {
		this.limit = limit;
	}
}
