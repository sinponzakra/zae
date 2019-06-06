package com.mst.projectEauPotableServeur.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mst.projectEauPotableServeur.entities.ConsomationParTranche;
import com.mst.projectEauPotableServeur.entities.ConsomationParTranchePK;

@CrossOrigin("*")
@RepositoryRestResource
public interface ConsomationParTrancheRepository extends JpaRepository<ConsomationParTranche, ConsomationParTranchePK>{

}
