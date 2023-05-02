package com.adjecti.recruitment.tracker.service;

import java.util.List;

import com.adjecti.recruitment.tracker.model.SelectionPhases;

public interface SelectionPhasesService {

	public List<SelectionPhases> getAll();
	
	public SelectionPhases getById(long id);
	
	public void delete(long id);
	
	public SelectionPhases add(SelectionPhases selectionPhase);
	
	public SelectionPhases update(long id , SelectionPhases selectionPhases);
}
