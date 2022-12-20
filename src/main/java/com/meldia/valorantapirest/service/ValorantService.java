package com.meldia.valorantapirest.service;

import java.util.*;

import com.meldia.valorantapirest.model.CharacterModel;

public interface ValorantService {
	
	List<CharacterModel> findAll();
	
	Optional<CharacterModel> findById(Long id);
	
	
	

}
