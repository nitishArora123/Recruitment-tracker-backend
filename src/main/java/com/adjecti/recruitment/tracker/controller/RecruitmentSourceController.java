package com.adjecti.recruitment.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("api/v1/recruitementSource")
public class RecruitmentSourceController {

	@Autowired
	private RecruitmentSourceServiceImpl recruitementSourceService;

	@GetMapping
	public List<RecruitementSource> getAllSources(@RequestBody RecruitementSource recruitementSource) {

		return recruitementSourceService.getAll();
	}

	@GetMapping("{id}")
	public RecruitementSource getById(@PathVariable("id") long id) {
		return recruitementSourceService.getById(id);
	}

	@PostMapping
	public RecruitementSource addRecruitementSource(@RequestBody RecruitementSource recruitementSource) {
		return recruitementSourceService.addRecruitmentSource(recruitementSource);
	}

	@DeleteMapping("{id}")
	public void deleteRecruitementSource(@PathVariable("id") long id) {
		recruitementSourceService.deleteRecruitmentSource(id);
	}

	@PutMapping("{id}")
	public RecruitementSource updateRecruitementSource(@PathVariable("id") long id,
			@RequestBody RecruitementSource recSource) {
		return recruitementSourceService.updateRecruitementSource(id, recSource);
	}

}