package com.adjecti.recruitment.tracker.service;

import java.util.List;

import com.adjecti.recruitment.tracker.model.SelectionPhases;

public interface SelectionPhasesService {

	public List<SelectionPhases> getAllPhases();
	
	public SelectionPhases getById(long id);
	
	public void deleteById(long id);
	
	public SelectionPhases addSelectionPhase(SelectionPhases selectionPhase);
	
	 public SelectionPhases updateSelectionPhases(long id , SelectionPhases selectionPhases);
}
