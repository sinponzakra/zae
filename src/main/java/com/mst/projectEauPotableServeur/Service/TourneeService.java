package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.TourneeRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.Tournee;

@Service
@Primary
public class TourneeService implements IDao<Tournee> {

	@Autowired
	private TourneeRepository tourneeRepository;

	@Override
	public void create(Tournee o) {
		tourneeRepository.save(o);
		
	}

	@Override
	public void update(Tournee o) {
		// TODO Auto-generated method stub
		tourneeRepository.save(o);
		
	}

	@Override
	public void delete(Tournee o) {
		// TODO Auto-generated method stub
		tourneeRepository.delete(o);
		
	}

	@Override
	public Tournee findById(int id) {
		// TODO Auto-generated method stub
		return tourneeRepository.findById(id).get();
	}

	@Override
	public List<Tournee> findAll() {
		// TODO Auto-generated method stub
		return tourneeRepository.findAll(); 
	}
	

}
