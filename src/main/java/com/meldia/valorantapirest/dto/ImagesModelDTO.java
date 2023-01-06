package com.meldia.valorantapirest.dto;

import com.meldia.valorantapirest.model.ImagesModel;

public class ImagesModelDTO {
	
	private String character_image;
	private String role_image;
	
	public ImagesModelDTO(ImagesModel images) {
		setCharacter_image(images.getCharacter_image());
		setRole_image(images.getRole_image());
	}
	
	public String getCharacter_image() {
		return character_image;
	}
	
	public void setCharacter_image(String character_image) {
		this.character_image = character_image;
	}
	
	public String getRole_image() {
		return role_image;
	}
	
	public void setRole_image(String role_image) {
		this.role_image = role_image;
	}
	
	

}
