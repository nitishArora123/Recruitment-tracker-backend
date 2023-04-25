package com.adjecti.recruitment.tracker.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjecti.recruitment.tracker.exception.DataNotFoundException;
import com.adjecti.recruitment.tracker.model.Candidate;
import com.adjecti.recruitment.tracker.repository.CandidateRepository;
import com.adjecti.recruitment.tracker.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	public CandidateRepository candidateRepository;

	public Candidate saveData(Candidate candidate) {
		return candidateRepository.save(candidate);
	}

	public Candidate getDataById(long id) {
		return candidateRepository.findById(id).get();
	}

	public List<Candidate> getAllCandidateData() {
		return candidateRepository.findAll();
	}

	public Candidate updateCandiadateData(long id, Candidate candidate) {
		Candidate user = candidateRepository.findById(id).get();
		if (user != null) {
			user.setFirstName(candidate.getFirstName());
			user.setLastName(candidate.getLastName());
			user.setMiddleName(candidate.getMiddleName());
			user.setDepartmentId(candidate.getDepartmentId());
			user.setDesignationId(candidate.getDesignationId());
			user.setRecruiterId(candidate.getRecruiterId());
			user.setRecruitmentSourceId(candidate.getRecruitmentSourceId());
			user.setAppliedDate(candidate.getAppliedDate());
			user.setComments(candidate.getComments());
		} else {
			throw new DataNotFoundException("Data For Particular Id is Not Available");
		}

		return user;
	}

	public void deleteCandidateData(long id) {
		candidateRepository.deleteById(id);
	}

}
