package com.adjecti.recruitment.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.recruitment.tracker.model.Candidate;
import com.adjecti.recruitment.tracker.service.CandidateService;

@RestController
@RequestMapping("api/v1/candidate")
public class CandidateController {

	@Autowired
	CandidateService candidateService;

	@PostMapping
	public ResponseEntity<Candidate> saveData(@RequestBody Candidate candidate) {
	    Candidate savedCandidate = candidateService.saveData(candidate);
	    return new ResponseEntity<>(savedCandidate, HttpStatus.OK);
	}


	@GetMapping("{id}")
	public ResponseEntity<Candidate> getById(@PathVariable("id") long id) {
	    Candidate candidate = candidateService.getDataById(id);
	    if (candidate != null) {
	        return new ResponseEntity<>(candidate, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

	@GetMapping
	public List<Candidate> getAllData() {
		return candidateService.getAllCandidateData(); 
	}

	@DeleteMapping("{id}")
	public void deleteCandidate(@PathVariable("id") long id) {
		candidateService.deleteCandidateData(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<Candidate> updateById(@PathVariable("id") long id, @RequestBody Candidate candidate) {
		return new ResponseEntity<Candidate>(candidateService.updateCandiadateData(id, candidate),HttpStatus.OK);

	}

}
