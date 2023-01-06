package com.meldia.valorantapirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.meldia.valorantapirest.model.*;

@Repository
public interface AbilitiesRepository extends JpaRepository<AbilitiesModel, Long> {
	
	@Query(value="SELECT * FROM valorant_api.valorant_abilities where id_character =:id_character", nativeQuery = true)
	List<AbilitiesModel> findByCharacterId(Integer id_character);

}
