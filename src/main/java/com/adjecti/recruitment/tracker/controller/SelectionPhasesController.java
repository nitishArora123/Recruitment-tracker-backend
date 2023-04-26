package com.adjecti.recruitment.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<SelectionPhases> addSelectionPhase(@RequestBody SelectionPhases selectionPhase) {
		return new ResponseEntity<SelectionPhases>(selectionPhases.addSelectionPhase(selectionPhase),HttpStatus.OK);
	}

	@GetMapping
	public List<SelectionPhases> getAllPhases() {
		return selectionPhases.getAllPhases();
	}

	@GetMapping("{id}")
	public ResponseEntity<SelectionPhases> getPhaseById(@PathVariable("id") long id) {
		return new ResponseEntity<SelectionPhases>(selectionPhases.getById(id),HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public void deleteSelectionPhase(@PathVariable("id") long id) {
		selectionPhases.deleteById(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<SelectionPhases> updateSelectionPhases(@PathVariable("id") long id,
			@RequestBody SelectionPhases selectionPhase) {
		return new ResponseEntity<SelectionPhases>( selectionPhases.updateSelectionPhases(id, selectionPhase),HttpStatus.OK);
	}
}
