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

	public Candidate save(Candidate candidate) {
		return candidateRepository.save(candidate);
	}

	public Candidate getById(long id) {
		return candidateRepository.findById(id).get();
	}

	public List<Candidate> getAll() {
		return candidateRepository.findAll();
	}

	public Candidate update(long id, Candidate candidate) {
		Candidate user = candidateRepository.findById(id).get();
		if (user != null) {
			user.setFirstName(candidate.getFirstName());
			user.setLastName(candidate.getLastName());
			user.setMiddleName(candidate.getMiddleName());
			user.setDepartmentId(candidate.getDepartmentId());
			user.setDesignationId(candidate.getDesignationId());
			user.setRecruiterId(candidate.getRecruiterId());
			//user.setRecruitmentSourceId(candidate.getRecruitmentSourceId());
			user.setAppliedDate(candidate.getAppliedDate());
			user.setComments(candidate.getComments());
			candidateRepository.save(user);
		} else {
			throw new DataNotFoundException("Data For Particular Id is Not Available");
		}

		return user;
	}

	public void delete(long id) {
		candidateRepository.deleteById(id);
	}

	@Override
	public List<String> findAll() {
		return candidateRepository.findAllCandidateNames();
	}

}
