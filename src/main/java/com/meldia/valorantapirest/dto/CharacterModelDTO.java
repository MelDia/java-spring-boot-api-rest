package com.meldia.valorantapirest.dto;

import java.util.List;

import com.meldia.valorantapirest.model.CharacterModel;

public class CharacterModelDTO {
	
	private Integer id;
	private String name;
	private String origin;
	private String biography;
	private String role;
	private List<AbilitiesModelDTO> abilities;
	private List<ImagesModelDTO> images;

	public CharacterModelDTO(CharacterModel val, List<AbilitiesModelDTO> abilities, List<ImagesModelDTO> images) {
		setId(val.getId());
		setName(val.getName());
		setOrigin(val.getOrigin());
		setRole(val.getRole());
		setBiography(val.getBiography());
		setAbilities(abilities);
		setImages(images);
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
	
	public List<AbilitiesModelDTO> getAbilities() {
		return abilities;
	}
	
	public void setAbilities(List<AbilitiesModelDTO> abilities) {
		this.abilities = abilities;
	}
	
	public List<ImagesModelDTO> getImages() {
		return images;
	}
	
	public void setImages(List<ImagesModelDTO> images) {
		this.images = images;
	}

	
	

}
