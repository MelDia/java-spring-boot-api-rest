package com.meldia.valorantapirest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meldia.valorantapirest.model.CharacterModel;
import com.meldia.valorantapirest.repository.ValorantRepository;
import com.meldia.valorantapirest.service.ValorantService;

@Service
public class ValorantServiceImpl implements ValorantService {
	
	@Autowired
	private ValorantRepository valRep;

	@Override
	public List<CharacterModel> findAll() {
		return valRep.findAll();
	}

	@Override
	public Optional<CharacterModel> findById(Long id) {
		return valRep.findById(id);
	}
	
}
