package com.adjecti.recruitment.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.recruitment.tracker.model.Candidate;

public interface CandidateService  {

	public Candidate save(Candidate candidate);
	
	public Candidate getById(long id);
	
	public Candidate update(long id , Candidate candidate);
	
	public List<Candidate> getAll();
	
	public void delete(long id);
	
	//public List<String> findAll();
	
}
