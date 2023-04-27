package com.adjecti.recruitment.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.adjecti.recruitment.tracker.model.SelectionPhases;
import com.adjecti.recruitment.tracker.service.SelectionPhasesService;
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/selectionPhase")
public class SelectionPhasesController {

	@Autowired
	private SelectionPhasesService selectionPhaseService;

	@PostMapping
	public ResponseEntity<SelectionPhases> addSelectionPhase(@RequestBody SelectionPhases selectionPhase) {
		return new ResponseEntity<SelectionPhases>(selectionPhaseService.add(selectionPhase),HttpStatus.OK);
	}

	@GetMapping
	public List<SelectionPhases> getAllPhases() {
		return selectionPhaseService.getAll();
	}

	@GetMapping("{id}")
	public ResponseEntity<SelectionPhases> getPhaseById(@PathVariable("id") long id) {
		return new ResponseEntity<SelectionPhases>(selectionPhaseService.getById(id),HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public void deleteSelectionPhase(@PathVariable("id") long id) {
		selectionPhaseService.delete(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<SelectionPhases> updateSelectionPhases(@PathVariable("id") long id,
			@RequestBody SelectionPhases selectionPhase) {
		return new ResponseEntity<SelectionPhases>(selectionPhaseService.update(id, selectionPhase),HttpStatus.OK);
	}
}
