package com.adjecti.recuritment.tracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.recuritment.tracker.model.Candidate;

@Service
public interface CandidateService  {

	public Candidate saveData(Candidate candidate);
	
	public Candidate getDataById(long id);
	
	public Candidate updateCandiadateData(long id , Candidate candidate);
	
	public List<Candidate> getAllCandidateData();
	
	public void deleteCandidateData(long id);
	
	
}
