package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.CompteRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.Compte;

@Service
@Primary
public class CompteService implements IDao<Compte>{

	@Autowired
	private CompteRepository compteRepository;

	@Override
	public void create(Compte o) {
		compteRepository.save(o);
		
	}

	@Override
	public void update(Compte o) {
		// TODO Auto-generated method stub
		compteRepository.save(o);
		
	}

	@Override
	public void delete(Compte o) {
		// TODO Auto-generated method stub
		compteRepository.delete(o);
		
	}

	@Override
	public Compte findById(int id) {
		// TODO Auto-generated method stub
		return compteRepository.findById(id).get();
	}

	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		return compteRepository.findAll(); 
	}
	

}
