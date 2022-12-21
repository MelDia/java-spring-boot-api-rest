package com.meldia.valorantapirest.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.meldia.valorantapirest.model.*;
import com.meldia.valorantapirest.payload.response.*;
import com.meldia.valorantapirest.service.impl.*;

@RestController
@RequestMapping("api/valorant")
public class ValorantController {
	
	@Autowired
	private ValorantServiceImpl service;
	
	@GetMapping(value = "/all", produces = "application/json")
	public ResponseEntity<String> getAll() throws JsonProcessingException {
		List<CharacterModel> response = service.findAll();
		return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
				"200", 
				"The data were processed",
				response.size(),
				response)).toString(), 
				HttpStatus.OK);
	}
	
	@GetMapping(value = "/name/{name}", produces = "application/json")
	public ResponseEntity<String> getByName(@PathVariable("name") String name) throws JsonProcessingException {
		System.out.println("NAME -> " + name);
		CharacterModel response = service.findByName(name);
		return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
				"200", 
				"The data were processed",
				response)).toString(), 
				HttpStatus.OK);
		
	}

	@GetMapping(value = "/role/{role}", produces = "application/json")
	public ResponseEntity<String> getByRole(@PathVariable("role") String role) throws JsonProcessingException {
		List<CharacterModel> response = service.findByRole(role);
		return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
				"200", 
				"The data were processed",
				response.size(),
				response)).toString(), 
				HttpStatus.OK);
	}
}
