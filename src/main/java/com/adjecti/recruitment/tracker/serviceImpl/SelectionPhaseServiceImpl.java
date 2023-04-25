package com.adjecti.recruitment.tracker.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjecti.recruitment.tracker.exception.DataNotFoundException;
import com.adjecti.recruitment.tracker.model.Interview;
import com.adjecti.recruitment.tracker.model.SelectionPhases;
import com.adjecti.recruitment.tracker.repository.SelectionPhasesRepository;
import com.adjecti.recruitment.tracker.service.SelectionPhasesService;

@Service
public class SelectionPhaseServiceImpl  implements SelectionPhasesService{

	@Autowired
	private SelectionPhasesRepository selectionPhaseRepository;
	
	
	@Override
	public List<SelectionPhases> getAllPhases() {
		
		return selectionPhaseRepository.findAll();
	}

	@Override
	public SelectionPhases getById(long id) {
		// TODO Auto-generated method stub
		return selectionPhaseRepository.findById(id).get();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		selectionPhaseRepository.deleteById(id);
	}

	@Override
	public SelectionPhases addSelectionPhase(SelectionPhases selectionPhase) {
		 return selectionPhaseRepository.save(selectionPhase);
	}

	@Override
	public SelectionPhases updateSelectionPhases(long id, SelectionPhases selectionPhase) {
		SelectionPhases selectionPhases = selectionPhaseRepository.findById(id).get();
		if(selectionPhases != null) {
			selectionPhases.setId(selectionPhase.getId());
			selectionPhases.setName(selectionPhase.getName());
		}else {
			throw new DataNotFoundException("Not found");
		}
		return selectionPhases;
	}
}

