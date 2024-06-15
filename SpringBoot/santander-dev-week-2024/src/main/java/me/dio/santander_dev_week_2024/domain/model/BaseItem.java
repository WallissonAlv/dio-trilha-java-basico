package me.dio.santander_dev_week_2024.domain.model;

public abstract class BaseItem {

	// ATRIBUTOS -----------------------------------
	private String icon;
	private String description;
	
	// METODOS ACESSORES ---------------------------
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
