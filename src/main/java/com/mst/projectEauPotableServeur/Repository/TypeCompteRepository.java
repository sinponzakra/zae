package com.mst.projectEauPotableServeur.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mst.projectEauPotableServeur.entities.TypeCompte;

@CrossOrigin("*")
@RepositoryRestResource
public interface TypeCompteRepository extends JpaRepository<TypeCompte, Integer>{
//	@RestResource(path="/typeComptes")
//	public List<TypeCompte> typeComptes();
//	@Query("select tc from TypeCompte tc")
}
