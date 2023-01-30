package com.meldia.valorantapirest.service;

import java.util.*;

import com.meldia.valorantapirest.dto.*;

public interface ValorantService {
	
	List<CharacterModelDTO> findAll();
	
	List<CharacterModelDTO> findByName(String name);

	List<CharacterModelDTO> findByRole(String role);	
	
	

}
