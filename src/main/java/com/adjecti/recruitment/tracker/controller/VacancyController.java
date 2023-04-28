package com.adjecti.recruitment.tracker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.recruitment.tracker.model.Vacancy;
import com.adjecti.recruitment.tracker.service.VacancyService;



@RestController
@RequestMapping("api/v1/vacancy")
public class VacancyController {
	
	@Autowired
	private VacancyService vacancyService;
	
	@PostMapping
	public ResponseEntity<Vacancy> save(@RequestBody Vacancy vacancy){
		return new ResponseEntity<Vacancy>(vacancyService.save(vacancy), HttpStatus.CREATED);
		
	}
	@GetMapping
	public List<Vacancy> findAll(){
		return vacancyService.findAll();
	}
	@GetMapping("{id}")
	public ResponseEntity<Optional<Vacancy>> findById(@PathVariable("id") long id){
		return new ResponseEntity<Optional<Vacancy>>(vacancyService.findById(id),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Vacancy> update(@PathVariable("id") long id ,@RequestBody Vacancy vacancy){
		return new ResponseEntity<Vacancy>(vacancyService.update(id, vacancy), HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> delete(@PathVariable("id") long id){
		
		// delete department from DB
		vacancyService.delete(id);
		return new ResponseEntity<String>("deleted successfully!.", HttpStatus.OK);
	}
	
	

}
