package com.meldia.valorantapirest.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "valorant_character")  
public class CharacterModel  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonProperty("id")
	private Integer id;
	
	@Column(name = "name")
	@JsonProperty("name")
	private String name;
	
	@Column(name = "origin")
	@JsonProperty("origin")
	private String origin;
	
	@Column(name = "role")
	@JsonProperty("role")
	private String role;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_character", referencedColumnName="id")
	private List<AbilitiesModel> abilities;
	
	@Column(name = "biography")
	@JsonProperty("biography")
	private String biography;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id", referencedColumnName="id")
	private List<ImagesModel> images;
	
	public CharacterModel() {
		
	}

	public CharacterModel(Integer id, String name, String origin, String role, List<AbilitiesModel> abilities,
			String biography, List<ImagesModel> images) {
		this.id = id;
		this.name = name;
		this.origin = origin;
		this.role = role;
		this.abilities = abilities;
		this.biography = biography;
		this.images = images;
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

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public List<ImagesModel> getImages() {
		return images;
	}

	public void setImages(List<ImagesModel> images) {
		this.images = images;
	}
	
	

}
