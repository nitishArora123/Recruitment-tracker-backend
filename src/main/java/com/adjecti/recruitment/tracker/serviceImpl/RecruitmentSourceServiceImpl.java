package com.adjecti.recruitment.tracker.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjecti.recruitment.tracker.exception.DataNotFoundException;
import com.adjecti.recruitment.tracker.model.RecruitementSource;
import com.adjecti.recruitment.tracker.model.SelectionPhases;
import com.adjecti.recruitment.tracker.repository.RecruitmentSourceRepository;
import com.adjecti.recruitment.tracker.service.RecruitmentSourceService;

@Service
public class RecruitmentSourceServiceImpl implements RecruitmentSourceService {

	@Autowired
	private RecruitmentSourceRepository recruitmentSourceRepository;

	@Override
	public List<RecruitementSource> getAll() {
		// TODO Auto-generated method stub
		return recruitmentSourceRepository.findAll();
	}

	@Override
	public RecruitementSource getById(long id) {
		// TODO Auto-generated method stub
		return recruitmentSourceRepository.findById(id).get();
	}

	@Override
	public RecruitementSource add(RecruitementSource recruitementSource) {
		// TODO Auto-generated method stub
		return recruitmentSourceRepository.save(recruitementSource);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		recruitmentSourceRepository.deleteById(id);
		
	}

	
	@Override
	public RecruitementSource update(long id, RecruitementSource recruitementSource) {
		RecruitementSource source = recruitmentSourceRepository.findById(id).get();
		if(source != null) {
			//source.setId(recruitementSource.getId());
			source.setName(recruitementSource.getName());
			recruitmentSourceRepository.save(source);
		}else {
			throw new DataNotFoundException("Not found");
		}
		return source;
	}
}
