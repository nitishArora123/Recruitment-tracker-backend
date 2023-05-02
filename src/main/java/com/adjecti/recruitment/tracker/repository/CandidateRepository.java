package com.adjecti.recruitment.tracker.repository;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adjecti.recruitment.tracker.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long>{

	//@Query(value = "SELECT first_name FROM candidate ",nativeQuery = true)
	//public List<String> findAll();


}
