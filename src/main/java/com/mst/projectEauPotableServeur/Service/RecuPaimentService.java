package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.RecuPaimentRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.RecuPaiment;

@Service
@Primary
public class RecuPaimentService implements IDao<RecuPaiment>{

	@Autowired
	private RecuPaimentRepository RecuPaimentRepository;

	@Override
	public void create(RecuPaiment o) {
		RecuPaimentRepository.save(o);
		
	}

	@Override
	public void update(RecuPaiment o) {
		// TODO Auto-generated method stub
		RecuPaimentRepository.save(o);
		
	}

	@Override
	public void delete(RecuPaiment o) {
		// TODO Auto-generated method stub
		RecuPaimentRepository.delete(o);
		
	}

	@Override
	public RecuPaiment findById(int id) {
		// TODO Auto-generated method stub
		return RecuPaimentRepository.findById(id).get();
	}

	@Override
	public List<RecuPaiment> findAll() {
		// TODO Auto-generated method stub
		return RecuPaimentRepository.findAll(); 
	}
	

}
