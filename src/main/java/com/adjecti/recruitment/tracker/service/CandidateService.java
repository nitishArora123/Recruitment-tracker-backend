package com.adjecti.recruitment.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.recruitment.tracker.model.Candidate;

public interface CandidateService  {

	public Candidate saveData(Candidate candidate);
	
	public Candidate getDataById(long id);
	
	public Candidate updateCandiadateData(long id , Candidate candidate);
	
	public List<Candidate> getAllCandidateData();
	
	public void deleteCandidateData(long id);
	
	
}
