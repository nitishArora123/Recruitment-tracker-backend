package com.adjecti.recruitment.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adjecti.recruitment.tracker.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long>{

}
