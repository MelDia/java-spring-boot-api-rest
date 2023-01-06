package com.meldia.valorantapirest.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.meldia.valorantapirest.model.CharacterModel;

@Repository
public interface ValorantRepository extends JpaRepository<CharacterModel, Long> {
	
	 @Query(value="SELECT * FROM valorant_character where name =:name", nativeQuery = true)
	 List<CharacterModel> findByName(String name);
	 
//	 @Query(value="SELECT * FROM valorant_character where name =:name", nativeQuery = true)
//	 CharacterModel findByName(String name);
//	 
	 @Query(value="SELECT * FROM valorant_character where role =:role", nativeQuery = true)
	 List<CharacterModel> findByRole(String role);
	
}
