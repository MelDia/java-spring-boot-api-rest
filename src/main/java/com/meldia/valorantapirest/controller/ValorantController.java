package com.meldia.valorantapirest.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.meldia.valorantapirest.model.*;
import com.meldia.valorantapirest.payload.response.*;
import com.meldia.valorantapirest.service.impl.*;

@RestController
@RequestMapping("api/valorant")
public class ValorantController {
	
	@Autowired
	private ValorantServiceImpl service;
	
	@GetMapping(value = "/all", produces = "application/json")
	public ResponseEntity<String> getAll() {
		//LogUtil.logText("Initiates the processing of data");
		List<CharacterModel> response = service.findAll();
		//LogUtil.logText("Data:" + response);
		return new ResponseEntity<String>(new JSONObject(new ValorantResponse(
				"200", 
				"The data were processed",
				response.size(),
				response)).toString(), 
				HttpStatus.OK);
	}
	
	//@GetMapping(value = "/name/{name}", produces = "application/json")

}
