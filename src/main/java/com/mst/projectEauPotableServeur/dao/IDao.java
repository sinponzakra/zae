package com.mst.projectEauPotableServeur.dao;

import java.util.List;

public interface IDao  <T>{

	List<T> findAll();
	void create(T o);
	void update (T o);
	void delete (T o);
	T findById(int id);
}
