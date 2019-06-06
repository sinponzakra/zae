package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.MembreRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.Membre;

@Service
@Primary
public class MembreService implements IDao<Membre>{

	@Autowired
	private MembreRepository membreRepository;

	@Override
	public void create(Membre o) {
		membreRepository.save(o);
		
	}

	@Override
	public void update(Membre o) {
		// TODO Auto-generated method stub
		membreRepository.save(o);
		
	}

	@Override
	public void delete(Membre o) {
		// TODO Auto-generated method stub
		membreRepository.delete(o);
		
	}

	@Override
	public Membre findById(int id) {
		// TODO Auto-generated method stub
		return membreRepository.findById(id).get();
	}

	@Override
	public List<Membre> findAll() {
		// TODO Auto-generated method stub
		return membreRepository.findAll(); 
	}
	

}
