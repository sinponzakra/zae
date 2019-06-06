package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.ContratRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.Contrat;

@Service
@Primary
public class ContratService implements IDao<Contrat>{

	@Autowired
	private ContratRepository contratRepository;

	@Override
	public void create(Contrat o) {
		contratRepository.save(o);
		
	}

	@Override
	public void update(Contrat o) {
		// TODO Auto-generated method stub
		contratRepository.save(o);
		
	}

	@Override
	public void delete(Contrat o) {
		// TODO Auto-generated method stub
		contratRepository.delete(o);
		
	}

	@Override
	public Contrat findById(int id) {
		// TODO Auto-generated method stub
		return contratRepository.findById(id).get();
	}

	@Override
	public List<Contrat> findAll() {
		// TODO Auto-generated method stub
		return contratRepository.findAll(); 
	}
	

}
