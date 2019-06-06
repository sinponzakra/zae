package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.TypeCompteRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.TypeCompte;


@Service
@Primary
public class typeCompteService implements IDao<TypeCompte>{

	@Autowired
	private TypeCompteRepository typeCompteRepository;

	@Override
	public void create(TypeCompte o) {
		// TODO Auto-generated method stub
		typeCompteRepository.save(o);
		
	}

	@Override
	public void update(TypeCompte o) {
		// TODO Auto-generated method stub
		typeCompteRepository.save(o);
		
	}

	@Override
	public void delete(TypeCompte o) {
		// TODO Auto-generated method stub
		typeCompteRepository.delete(o);
		
	}

	@Override
	public TypeCompte findById(int id) {
		// TODO Auto-generated method stub
		return typeCompteRepository.findById(id).get();
	}

	@Override
	public List<TypeCompte> findAll() {
		// TODO Auto-generated method stub
		return typeCompteRepository.findAll(); 
	}
	

}
