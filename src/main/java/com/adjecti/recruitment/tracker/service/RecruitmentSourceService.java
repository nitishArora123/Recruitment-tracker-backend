package com.adjecti.recruitment.tracker.service;

import java.util.List;

import com.adjecti.recruitment.tracker.model.RecruitementSource;

public interface RecruitmentSourceService {

	public List<RecruitementSource> getAll();
	
	public RecruitementSource getById(long id);
	
	public RecruitementSource addRecruitmentSource(RecruitementSource recruitementSource);
	
	public void deleteRecruitmentSource(long id);
	
	public RecruitementSource updateRecruitementSource(long id , RecruitementSource recruitementSource);
}
