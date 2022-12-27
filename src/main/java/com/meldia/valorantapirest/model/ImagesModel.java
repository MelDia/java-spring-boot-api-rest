package com.meldia.valorantapirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "valorant_images")
public class ImagesModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonProperty("id")
	private Long id;
	
	@Column(name = "character_image")
	@JsonProperty("character_image")
	private String character_image;
	
	@Column(name = "role_image")
	@JsonProperty("role_image")
	private String role_image;

	public ImagesModel() {
		
	}

	public ImagesModel(Long id, String character_image, String role_image) {
		this.id = id;
		this.character_image = character_image;
		this.role_image = role_image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
