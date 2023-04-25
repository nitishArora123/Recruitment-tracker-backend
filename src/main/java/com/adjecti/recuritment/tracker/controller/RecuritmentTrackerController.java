package com.adjecti.recuritment.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.adjecti.recuritment.tracker.model.Candidate;
import com.adjecti.recuritment.tracker.service.CandidateService;

@Controller
public class RecuritmentTrackerController {

	@Autowired
	CandidateService recuritmentService;

	@PostMapping("/save")
	public Candidate saveData(@RequestBody Candidate candidate) {
		return recuritmentService.saveData(candidate);
	}

	@GetMapping("/get/{id}")
	public Candidate getById(@PathVariable("id") long id) {
		return recuritmentService.getDataById(id);

	}

	@GetMapping("/getAll")
	public List<Candidate> getAllData() {
		return recuritmentService.getAllCandidateData();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCandidate(@PathVariable("id") long id) {
		recuritmentService.deleteCandidateData(id);
	}

	@PutMapping("/update/{id}")
	public Candidate updateById(@PathVariable("id") long id, @RequestBody Candidate candidate) {
		return recuritmentService.updateCandiadateData(id, candidate);

	}

}
