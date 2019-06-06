package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.TrancheRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.Tranche;

@Service
@Primary
public class TrancheService implements IDao<Tranche>{

	@Autowired
	private TrancheRepository TrancheRepository;

	@Override
	public void create(Tranche o) {
		TrancheRepository.save(o);
		
	}

	@Override
	public void update(Tranche o) {
		// TODO Auto-generated method stub
		TrancheRepository.save(o);
		
	}

	@Override
	public void delete(Tranche o) {
		// TODO Auto-generated method stub
		TrancheRepository.delete(o);
		
	}

	@Override
	public Tranche findById(int id) {
		// TODO Auto-generated method stub
		return TrancheRepository.findById(id).get();
	}

	@Override
	public List<Tranche> findAll() {
		// TODO Auto-generated method stub
		return TrancheRepository.findAll(); 
	}
	

}
