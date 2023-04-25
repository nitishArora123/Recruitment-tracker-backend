package com.adjecti.recruitment.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.recruitment.tracker.model.Interview;

public interface InterviewService {

	public List<Interview> getAllInterviewDetails();
	
	public void cancelInterview(long id);
	
	public  Interview scheduleInterview(Interview interview);
	
    public Interview getInterviewDetailsById(long id);
	
    public Interview updateScheduledInterview(long id , Interview interview);
	
}
