package me.dio.santander_dev_week_2024.domain.model;

import java.util.List;

public class User {

	// ATRIBUTOS -----------------------------------
	private Long id;
	private String name;
	private Account account;
	private List<Feature> feature;
	private Card card;
	private List<News> news;
	
	// METODOS ACESSORES ---------------------------
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public List<Feature> getFeature() {
		return feature;
	}
	public void setFeature(List<Feature> feature) {
		this.feature = feature;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}
}
