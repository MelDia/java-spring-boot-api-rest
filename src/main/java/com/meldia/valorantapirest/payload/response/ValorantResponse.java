package com.meldia.valorantapirest.payload.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.meldia.valorantapirest.dto.*;

@JsonInclude(Include.NON_NULL)
public class ValorantResponse {
	
	private String codeResponse;
	private String message;
	private Integer numberRecords;
	private List<CharacterModelDTO>  characterData;
	private List<CharacterModelDTO>  characterDato;

	public ValorantResponse() {
		
	}

	public ValorantResponse(String codeResponse, String message, Integer numberRecords,
			List<CharacterModelDTO> characterData) {
		super();
		this.codeResponse = codeResponse;
		this.message = message;
		this.numberRecords = numberRecords;
		this.characterData = characterData;
	}

	public ValorantResponse(String codeResponse, String message, List<CharacterModelDTO> characterDato) {
		super();
		this.codeResponse = codeResponse;
		this.message = message;
		this.characterDato = characterDato;
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

	public List<CharacterModelDTO> getCharacterData() {
		return characterData;
	}

	public void setCharacterData(List<CharacterModelDTO> characterData) {
		this.characterData = characterData;
	}

	public List<CharacterModelDTO> getCharacterDato() {
		return characterDato;
	}

	public void setCharacterDato(List<CharacterModelDTO> characterDato) {
		this.characterDato = characterDato;
	}

	
	
}
