package com.meldia.valorantapirest.payload.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.meldia.valorantapirest.model.CharacterModel;

@JsonInclude(Include.NON_NULL)
public class ValorantResponse {
	
	private String codeResponse;
	private String message;
	private Integer numberRecords;
	private List<CharacterModel>  characterData;
	private CharacterModel  characterDato;

	public ValorantResponse() {
		
	}

	public ValorantResponse(String codeResponse, String message, Integer numberRecords, List<CharacterModel> characterData) {
		this.codeResponse = codeResponse;
		this.message = message;
		this.numberRecords = numberRecords;
		this.characterData = characterData;
	}

	public ValorantResponse(String codeResponse, String message, CharacterModel response) {
		this.codeResponse = codeResponse;
		this.message = message;
		this.setCharacterDato(response);
	}

	public String getCodeResponse() {
		return codeResponse;
	}

	public void setCodeResponse(String codeResponse) {
		this.codeResponse = codeResponse;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNumberRecords() {
		return numberRecords;
	}


	public void setNumberRecords(Integer numberRecords) {
		this.numberRecords = numberRecords;
	}

	public List<CharacterModel> getCharacterData() {
		return characterData;
	}

	public void setCharacterData(List<CharacterModel> characterData) {
		this.characterData = characterData;
	}

	public CharacterModel getCharacterDato() {
		return characterDato;
	}

	public void setCharacterDato(CharacterModel characterDato) {
		this.characterDato = characterDato;
	}


	
}
