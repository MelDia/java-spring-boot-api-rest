package com.meldia.valorantapirest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meldia.valorantapirest.dto.*;
import com.meldia.valorantapirest.model.AbilitiesModel;
import com.meldia.valorantapirest.model.CharacterModel;
import com.meldia.valorantapirest.model.ImagesModel;
import com.meldia.valorantapirest.repository.AbilitiesRepository;
import com.meldia.valorantapirest.repository.ImagesRepository;
import com.meldia.valorantapirest.repository.ValorantRepository;
import com.meldia.valorantapirest.service.ValorantService;

@Service
public class ValorantServiceImpl implements ValorantService {
	
	@Autowired
	private ValorantRepository valRep;
	
	@Autowired
	private AbilitiesRepository abilitiesRep;
	
	@Autowired
	private ImagesRepository imagesRep;

	@Override
	public List<CharacterModelDTO> findAll() {
		List<CharacterModel> valorant = valRep.findAll();
		List<CharacterModelDTO> valorantDto = new ArrayList<>();
		valorant.forEach(val -> {
			List<AbilitiesModelDTO> abilities = getAbilities(val.getId());
			List<ImagesModelDTO> images = getImages(val.getId());
			valorantDto.add(new CharacterModelDTO(val, abilities, images));
		});
		return valorantDto;
	}
	
	@Override
	public List<CharacterModelDTO> findByName(String name) {
		List<CharacterModel> valorant = valRep.findByName(name);
		List<CharacterModelDTO> valorantDto = new ArrayList<>();
		valorant.forEach(val -> {
			List<AbilitiesModelDTO> abilities = getAbilities(val.getId());
			List<ImagesModelDTO> images = getImages(val.getId());
			valorantDto.add(new CharacterModelDTO(val, abilities, images));
		});

		return valorantDto;
	}
	
	@Override
	public List<CharacterModelDTO> findByRole(String role) {
		List<CharacterModel> valorant = valRep.findByRole(role);
		List<CharacterModelDTO> valorantDto = new ArrayList<>();
		valorant.forEach(val -> {
			List<AbilitiesModelDTO> abilities = getAbilities(val.getId());
			List<ImagesModelDTO> images = getImages(val.getId());
			valorantDto.add(new CharacterModelDTO(val, abilities, images));
		});
		
		return valorantDto;
	}
	
	public List<AbilitiesModelDTO> getAbilities(Integer id) {
		List<AbilitiesModel> abilities = abilitiesRep.findByCharacterId(id);
		List<AbilitiesModelDTO> abilitiesDto = new ArrayList<>();
		abilities.forEach(ability -> {
			abilitiesDto.add(new AbilitiesModelDTO(ability));
		});
		
		return abilitiesDto;
		
	}
	
	public List<ImagesModelDTO> getImages(Integer id) {
		List<ImagesModel> images = imagesRep.findById(id);
		List<ImagesModelDTO> imagesDto = new ArrayList<>();
		images.forEach(image -> {
			imagesDto.add(new ImagesModelDTO(image));
		});
		
		return imagesDto;
		
	}

	public CharacterDTO getCharacterByName(CharacterModel valorant) {
		List<AbilitiesModel> abilities = abilitiesRep.findByCharacterId(valorant.getId());
		CharacterDTO valorantByNameDTO = new CharacterDTO(valorant, abilities);
		return valorantByNameDTO;
	}


}
