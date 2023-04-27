package com.adjecti.recruitment.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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

import com.adjecti.recruitment.tracker.model.Interview;
import com.adjecti.recruitment.tracker.service.InterviewService;
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/interview")
public class InterviewController {

	@Autowired
	private InterviewService interviewService;
	
	@PostMapping
	public ResponseEntity<Interview> scheduleInterview(@RequestBody Interview interview) {
		return new ResponseEntity<Interview>(interviewService.schedule(interview),HttpStatus.OK);
	}
	
	@GetMapping
	public List<Interview> getAllInterviewDetails()	{
		return interviewService.getAll();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Interview> getById(@PathVariable ("id") long id) {
		return new ResponseEntity<Interview>(interviewService.getById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
    public void cancelInterview(@PathVariable("id") long id) {
    	interviewService.cancel(id);
    }
    
	@PutMapping("{id}")
    public ResponseEntity<Interview> updateInterviewDetails(@PathVariable("id") long id, @RequestBody Interview interview ) {
		return new ResponseEntity<Interview> (interviewService.update(id, interview),HttpStatus.OK);
	}
}
