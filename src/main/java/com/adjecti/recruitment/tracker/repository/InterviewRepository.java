package com.adjecti.recruitment.tracker.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.recruitment.tracker.model.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Long>{

}