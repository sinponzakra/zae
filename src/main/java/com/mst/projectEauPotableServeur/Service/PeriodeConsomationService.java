package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.PeriodeConsomationRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.PeriodeConsomation;

@Service
@Primary
public class PeriodeConsomationService implements IDao<PeriodeConsomation>{

	@Autowired
	private PeriodeConsomationRepository PeriodeConsomationRepository;

	@Override
	public void create(PeriodeConsomation o) {
		PeriodeConsomationRepository.save(o);
		
	}

	@Override
	public void update(PeriodeConsomation o) {
		// TODO Auto-generated method stub
		PeriodeConsomationRepository.save(o);
		
	}

	@Override
	public void delete(PeriodeConsomation o) {
		// TODO Auto-generated method stub
		PeriodeConsomationRepository.delete(o);
		
	}

	@Override
	public PeriodeConsomation findById(int id) {
		// TODO Auto-generated method stub
		return PeriodeConsomationRepository.findById(id).get();
	}

	@Override
	public List<PeriodeConsomation> findAll() {
		// TODO Auto-generated method stub
		return PeriodeConsomationRepository.findAll(); 
	}
	

}
