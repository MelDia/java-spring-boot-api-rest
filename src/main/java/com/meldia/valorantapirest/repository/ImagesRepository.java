package com.meldia.valorantapirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.meldia.valorantapirest.model.*;

@Repository
public interface ImagesRepository extends JpaRepository<ImagesModel, Long>{
	
	@Query(value="SELECT * FROM valorant_api.valorant_images where id =:id", nativeQuery = true)
	List<ImagesModel> findById(Integer id);

}
