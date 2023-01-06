package com.meldia.valorantapirest.dto;

import com.meldia.valorantapirest.model.AbilitiesModel;

public class AbilitiesModelDTO {
	
	private String ability_name;
	private String description;
	private String keyboard;
	
	public AbilitiesModelDTO(AbilitiesModel abilities) {
		setAbility_name(abilities.getAbility_name());
		setDescription(abilities.getDescription());
		setKeyboard(abilities.getKeyboard());
	}
	
	public String getAbility_name() {
		return ability_name;
	}
	
	public void setAbility_name(String ability_name) {
		this.ability_name = ability_name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getKeyboard() {
		return keyboard;
	}
	
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	
	

}
