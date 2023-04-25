package com.adjecti.recruitment.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.recruitment.tracker.model.Interview;
import com.adjecti.recruitment.tracker.model.SelectionPhases;
import com.adjecti.recruitment.tracker.serviceImpl.SelectionPhaseServiceImpl;

@RestController
@RequestMapping("api/v1/selectionPhase")
public class SelectionPhasesController {

	@Autowired
	private SelectionPhaseServiceImpl selectionPhases;

	@PostMapping
	public SelectionPhases addSelectionPhase(@RequestBody SelectionPhases selectionPhase) {
		return selectionPhases.addSelectionPhase(selectionPhase);
	}

	@GetMapping
	public List<SelectionPhases> getAllPhases() {
		return selectionPhases.getAllPhases();
	}

	@GetMapping("{id}")
	public SelectionPhases getPhaseById(@PathVariable("id") long id) {
		return selectionPhases.getById(id);
	}

	@DeleteMapping("{id}")
	public void deleteSelectionPhase(@PathVariable("id") long id) {
		selectionPhases.deleteById(id);
	}

	@PutMapping("{id}")
	public SelectionPhases updateSelectionPhases(@PathVariable("id") long id,
			@RequestBody SelectionPhases selectionPhase) {
		return selectionPhases.updateSelectionPhases(id, selectionPhase);
	}
}
