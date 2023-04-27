package com.adjecti.recruitment.tracker.service;

import java.util.List;

import com.adjecti.recruitment.tracker.model.RecruitementSource;

public interface RecruitmentSourceService {

	public List<RecruitementSource> getAll();
	
	public RecruitementSource getById(long id);
	
	public RecruitementSource add(RecruitementSource recruitementSource);
	
	public void delete(long id);
	
	public RecruitementSource update(long id , RecruitementSource recruitementSource);
}
