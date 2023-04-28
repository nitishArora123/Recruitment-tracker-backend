package com.adjecti.recruitment.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.recruitment.tracker.model.Vacancy;

public interface VacancyRepository  extends JpaRepository<Vacancy,Long>{

}
