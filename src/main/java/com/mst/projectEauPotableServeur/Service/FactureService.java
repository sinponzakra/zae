package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.FactureRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.Facture;

@Service
@Primary
public class FactureService implements IDao<Facture>{

	@Autowired
	private FactureRepository FactureRepository;

	@Override
	public void create(Facture o) {
		FactureRepository.save(o);
		
	}

	@Override
	public void update(Facture o) {
		// TODO Auto-generated method stub
		FactureRepository.save(o);
		
	}

	@Override
	public void delete(Facture o) {
		// TODO Auto-generated method stub
		FactureRepository.delete(o);
		
	}

	@Override
	public Facture findById(int id) {
		// TODO Auto-generated method stub
		return FactureRepository.findById(id).get();
	}

	@Override
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return FactureRepository.findAll(); 
	}
	

}
