package com.meldia.valorantapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meldia.valorantapirest.model.CharacterModel;

@Repository
public interface ValorantRepository extends JpaRepository<CharacterModel, Long> {
	
}
