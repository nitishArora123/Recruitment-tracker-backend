package com.adjecti.recruitment.tracker.service;

import java.util.List;
import java.util.Optional;

import com.adjecti.recruitment.tracker.model.Candidate;
import com.adjecti.recruitment.tracker.model.Vacancy;

public interface VacancyService {
	
    public Vacancy save(Vacancy vacancy);
	public Optional<Vacancy> findById(long id);
	public Vacancy update(long id , Vacancy vacancy);
	public List<Vacancy> findAll();
	public void delete(long id);

}
