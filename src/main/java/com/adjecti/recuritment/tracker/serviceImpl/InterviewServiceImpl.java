package com.adjecti.recuritment.tracker.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.adjecti.recuritment.tracker.model.Interview;
import com.adjecti.recuritment.tracker.repository.InterviewRepository;
import com.adjecti.recuritment.tracker.service.InterviewService;

public class InterviewServiceImpl implements InterviewService {

	@Autowired
	private InterviewRepository interviewRepository;
	
	@Override
	public List<Interview> getAllInterviewDetails() {
		return null;
	}

	@Override
	public void cancelInterview(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Interview scheduleInterview(Interview interview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interview getInterviewDetailsById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interview updateScheduledInterview(long id, Interview interview) {
		// TODO Auto-generated method stub
		return null;
	}

}
