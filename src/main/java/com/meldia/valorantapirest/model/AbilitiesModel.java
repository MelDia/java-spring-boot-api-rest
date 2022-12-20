package com.meldia.valorantapirest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "valorant_abilities")
public class AbilitiesModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonProperty("id")
	private Integer id;
	
	@Column(name = "id_character")
	@JsonProperty("id_character")
	private Integer id_character;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="id", referencedColumnName="id")
//	private List<AbilitiesTypeModel> id_type;
	
	@Column(name = "ability_name")
	@JsonProperty("ability_name")
	private String ability_name;
	
	@Column(name = "description")
	@JsonProperty("description")
	private String description;
	
	@Column(name = "keyboard")
	@JsonProperty("keyboard")
	private String keyboard;

	public AbilitiesModel() {

	}

	public AbilitiesModel(Integer id, Integer id_character, String ability_name, String description,
			String keyboard) {
		this.id = id;
		this.id_character = id_character;
		//this.id_type = id_type;
		this.ability_name = ability_name;
		this.description = description;
		this.keyboard = keyboard;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_character() {
		return id_character;
	}

	public void setId_character(Integer id_character) {
		this.id_character = id_character;
	}

//	public List<AbilitiesTypeModel> getId_type() {
//		return id_type;
//	}
//
//	public void setId_type(List<AbilitiesTypeModel> id_type) {
//		this.id_type = id_type;
//	}

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
