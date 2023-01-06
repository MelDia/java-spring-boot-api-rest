package com.meldia.valorantapirest.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ValorantBadResponse {
	
	private String codeResponse;
	private String message;

	public ValorantBadResponse() {
		
	}

	public ValorantBadResponse(String codeResponse, String message) {
		this.codeResponse = codeResponse;
		this.message = message;
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

	
}
