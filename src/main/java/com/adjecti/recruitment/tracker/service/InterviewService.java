package com.adjecti.recruitment.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.recruitment.tracker.model.Interview;

public interface InterviewService {

	public List<Interview> getAll();
	
	public void cancel(long id);
	
	public  Interview schedule(Interview interview);
	
    public Interview getById(long id);
	
    public Interview update(long id , Interview interview);
	
}
