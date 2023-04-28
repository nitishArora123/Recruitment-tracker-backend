package com.adjecti.recruitment.tracker.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.adjecti.recruitment.tracker.exception.DataNotFoundException;
import com.adjecti.recruitment.tracker.model.Vacancy;
import com.adjecti.recruitment.tracker.repository.VacancyRepository;
import com.adjecti.recruitment.tracker.service.VacancyService;


public class VacancyServiceImpl implements VacancyService {
	
	
	@Autowired
	private VacancyRepository vacancyRepository;

	@Override
	public Vacancy save(Vacancy vacancy) {
		return vacancyRepository.save(vacancy);
	}

	@Override
	public Optional<Vacancy> findById(long id) {
		
		return vacancyRepository.findById(id);
	}

	@Override
	public Vacancy update(long id, Vacancy vacancy) {
		Vacancy vacancies = vacancyRepository.findById(id).get();
		if (vacancies != null) {
			vacancies.setDepartmentId(vacancy.getDepartmentId());
			vacancies.setDesignationId(vacancy.getDesignationId());
			vacancies.setEndDate(vacancy.getEndDate());
			vacancies.setStartDate(vacancy.getStartDate());
			vacancies.setHiringChannel(vacancy.getHiringChannel());
			vacancies.setHiringType(vacancy.getHiringType());
			vacancies.setNoOfVacancy(vacancy.getNoOfVacancy());
			vacancies.setOpeningDate(vacancy.getOpeningDate());
			vacancies.setStatus(vacancy.getStatus());
			vacancyRepository.save(vacancies);
		} else {
			throw new DataNotFoundException("Data For Particular Id is Not Available");
		}

		return vacancies;
	}

	@Override
	public List<Vacancy> findAll() {
		return vacancyRepository.findAll();
	}

	@Override
	public void delete(long id) {
		vacancyRepository.deleteById(id);
	}

}
