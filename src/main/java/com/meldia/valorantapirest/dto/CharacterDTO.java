package com.meldia.valorantapirest.dto;

import java.util.List;

import com.meldia.valorantapirest.model.AbilitiesModel;
import com.meldia.valorantapirest.model.CharacterModel;

public class CharacterDTO {
	
	private Integer id;
	private String name;
	private String origin;
	private String biography;
	private String role;
	private List<AbilitiesModel> abilities;
	
	public CharacterDTO(CharacterModel val, List<AbilitiesModel> abilities) {
		setId(val.getId());
		setName(val.getName());
		setOrigin(val.getOrigin());
		setRole(val.getRole());
		setBiography(val.getBiography());
		setAbilities(abilities);
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getBiography() {
		return biography;
	}
	
	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	public List<AbilitiesModel> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<AbilitiesModel> abilities) {
		this.abilities = abilities;
	}
	
	
	
	

}
