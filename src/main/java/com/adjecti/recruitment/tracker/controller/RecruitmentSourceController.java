package com.adjecti.recruitment.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.recruitment.tracker.model.RecruitementSource;
import com.adjecti.recruitment.tracker.serviceImpl.RecruitmentSourceServiceImpl;
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/recruitementSource")
public class RecruitmentSourceController {

	@Autowired
	private RecruitmentSourceServiceImpl recruitementSourceService;

	@GetMapping
	public List<RecruitementSource> getAllSources() {

		return recruitementSourceService.getAll();
	}

	@GetMapping("{id}")
	public ResponseEntity<RecruitementSource> getById(@PathVariable("id") long id) {
		return new ResponseEntity<RecruitementSource>(recruitementSourceService.getById(id),HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<RecruitementSource> addRecruitementSource(@RequestBody RecruitementSource recruitementSource) {
		return new ResponseEntity<RecruitementSource>(recruitementSourceService.addRecruitmentSource(recruitementSource),HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public void deleteRecruitementSource(@PathVariable("id") long id) {
		recruitementSourceService.deleteRecruitmentSource(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<RecruitementSource> updateRecruitementSource(@PathVariable("id") long id,
			@RequestBody RecruitementSource recSource) {
		return new ResponseEntity<RecruitementSource>(recruitementSourceService.updateRecruitementSource(id, recSource),HttpStatus.OK);
	}

}
