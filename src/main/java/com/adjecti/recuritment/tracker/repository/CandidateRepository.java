package com.adjecti.recuritment.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adjecti.recuritment.tracker.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long>{

}
