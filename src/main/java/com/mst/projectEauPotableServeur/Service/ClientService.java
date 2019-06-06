package com.mst.projectEauPotableServeur.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mst.projectEauPotableServeur.Repository.ClientRepository;
import com.mst.projectEauPotableServeur.dao.IDao;
import com.mst.projectEauPotableServeur.entities.Client;

@Service
@Primary
public class ClientService implements IDao<Client>{

	@Autowired
	private ClientRepository ClientRepository;

	@Override
	public void create(Client o) {
		ClientRepository.save(o);
		
	}

	@Override
	public void update(Client o) {
		// TODO Auto-generated method stub
		ClientRepository.save(o);
		
	}

	@Override
	public void delete(Client o) {
		// TODO Auto-generated method stub
		ClientRepository.delete(o);
		
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return ClientRepository.findById(id).get();
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return ClientRepository.findAll(); 
	}
	

}
