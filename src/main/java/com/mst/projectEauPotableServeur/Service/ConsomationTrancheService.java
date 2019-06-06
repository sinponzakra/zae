package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.ConsomationParTrancheRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.ConsomationParTranche;
import com.mst.projectEauPotableServeur.entities.ConsomationParTranchePK;

@Service
@Primary
public class ConsomationTrancheService implements IDao<ConsomationParTranche>{

	@Autowired
	private ConsomationParTrancheRepository ConsomationParTrancheRepository;

	@Override
	public void create(ConsomationParTranche o) {
		ConsomationParTrancheRepository.save(o);
		
	}

	@Override
	public void update(ConsomationParTranche o) {
		// TODO Auto-generated method stub
		ConsomationParTrancheRepository.save(o);
		
	}

	@Override
	public void delete(ConsomationParTranche o) {
		// TODO Auto-generated method stub
		ConsomationParTrancheRepository.delete(o);
		
	}
	@Override
	public List<ConsomationParTranche> findAll() {
		// TODO Auto-generated method stub
		return ConsomationParTrancheRepository.findAll(); 
	}

	@Override
	public ConsomationParTranche findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
