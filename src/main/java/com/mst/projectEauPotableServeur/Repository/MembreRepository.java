package com.mst.projectEauPotableServeur.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mst.projectEauPotableServeur.entities.Membre;

@CrossOrigin("*")
@RepositoryRestResource
public interface MembreRepository extends JpaRepository<Membre, Integer>{
@Query("SELECT m FROM Membre m WHERE m.compte.login = ?1")
Membre findByLogin(String login);
}
