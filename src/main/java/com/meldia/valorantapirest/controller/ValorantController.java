package com.meldia.valorantapirest.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.meldia.valorantapirest.dto.CharacterModelDTO;
import com.meldia.valorantapirest.payload.response.*;
import com.meldia.valorantapirest.service.impl.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/valorant")
public class ValorantController {
	
	@Autowired
	private ValorantServiceImpl service;
	
	@GetMapping(value = "/all", produces = "application/json")
	public ResponseEntity<String> getAllCharacter() {
		List<CharacterModelDTO> response = service.findAll();
		
		if(response.isEmpty()) {
			return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
					"400", 
					"The data is empty.",
					null)).toString(), 
					HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
				"200",
				"The data were processed",
				response.size(),
				response)).toString(), 
				HttpStatus.OK);
	}
	
	@GetMapping(value = "/name/{name}", produces = "application/json")
	public ResponseEntity<String> getByName(@PathVariable("name") String name) {
		
		List<CharacterModelDTO> response = service.findByName(name);	
		
		if(response.isEmpty()) {
			return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
					"400", 
					"The data is empty.",
					null)).toString(), 
					HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
				"200", 
				"The data were processed",
				response)).toString(), 
				HttpStatus.OK);
		
	}

	@GetMapping(value = "/role/{role}", produces = "application/json")
	public ResponseEntity<String> getByRole(@PathVariable("role") String role) {
		List<CharacterModelDTO> response = service.findByRole(role);
		
		if(response.isEmpty()) {
			return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
					"400", 
					"The data is empty.",
					null)).toString(), 
					HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
				"200", 
				"The data were processed",
				response.size(),
				response)).toString(), 
				HttpStatus.OK);
	}
}
