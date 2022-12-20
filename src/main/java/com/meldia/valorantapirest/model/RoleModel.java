package com.meldia.valorantapirest.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "valorant_roles")
public class RoleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonProperty("id")
	private Integer id;
	
	@Column(name = "role_name")
	@JsonProperty("name")
	private String role_name;
	
	
	public RoleModel() {
		
	}

	public RoleModel(Integer id, String role_name) {
		this.id = id;
		this.role_name = role_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}




}
