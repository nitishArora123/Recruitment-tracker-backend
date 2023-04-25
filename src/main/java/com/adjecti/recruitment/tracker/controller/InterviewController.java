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
import com.adjecti.recruitment.tracker.service.InterviewService;

@RestController
@RequestMapping("api/v1/interview")
public class InterviewController {

	@Autowired
	private InterviewService interviewService;
	
	@PostMapping
	public Interview scheduleInterview(@RequestBody Interview interview) {
		return interviewService.scheduleInterview(interview);
	}
	
	@GetMapping
	public List<Interview> getAllInterviewDetails()	{
		return interviewService.getAllInterviewDetails();
	}
	
	@GetMapping("{id}")
	public Interview getById(@PathVariable ("id") long id) {
		return interviewService.getInterviewDetailsById(id);
	}
	
	@DeleteMapping("{id}")
    public void cancelInterview(@PathVariable("id") long id) {
    	interviewService.cancelInterview(id);
    }
    
	@PutMapping("{id}")
    public Interview updateInterviewDetails(@PathVariable("id") long id, @RequestBody Interview interview ) {
		return interviewService.updateScheduledInterview(id, interview);
	}
}
