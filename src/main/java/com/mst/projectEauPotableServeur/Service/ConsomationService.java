package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.ConsomationRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.Consomation;

@Service
@Primary
public class ConsomationService implements IDao<Consomation>{

	@Autowired
	private ConsomationRepository consomationRepository;

	@Override
	public void create(Consomation o) {
		consomationRepository.save(o);
		
	}

	@Override
	public void update(Consomation o) {
		// TODO Auto-generated method stub
		consomationRepository.save(o);
		
	}

	@Override
	public void delete(Consomation o) {
		// TODO Auto-generated method stub
		consomationRepository.delete(o);
		
	}

	@Override
	public Consomation findById(int id) {
		// TODO Auto-generated method stub
		return consomationRepository.findById(id).get();
	}

	@Override
	public List<Consomation> findAll() {
		// TODO Auto-generated method stub
		return consomationRepository.findAll(); 
	}
	

}
