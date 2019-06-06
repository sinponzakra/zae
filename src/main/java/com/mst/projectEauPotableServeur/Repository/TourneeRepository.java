package com.mst.projectEauPotableServeur.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mst.projectEauPotableServeur.entities.Tournee;

@CrossOrigin("*")
@RepositoryRestResource
public interface TourneeRepository extends JpaRepository<Tournee, Integer>{

}
