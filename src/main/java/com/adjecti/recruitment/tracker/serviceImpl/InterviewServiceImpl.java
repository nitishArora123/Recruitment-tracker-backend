package com.adjecti.recruitment.tracker.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjecti.recruitment.tracker.exception.DataNotFoundException;
import com.adjecti.recruitment.tracker.model.Interview;
import com.adjecti.recruitment.tracker.repository.InterviewRepository;
import com.adjecti.recruitment.tracker.service.InterviewService;
@Service
public class InterviewServiceImpl implements InterviewService {

	@Autowired
	private InterviewRepository interviewRepository;
	
	@Override
	public List<Interview> getAll() {
		return interviewRepository.findAll();
	}

	@Override
	public void cancel(long id) {
		interviewRepository.deleteById(id);
		
	}

	@Override
	public Interview schedule(Interview interview) {
		// TODO Auto-generated method stub
		return interviewRepository.save(interview);
	}

	@Override
	public Interview getById(long id) {
		return interviewRepository.findById(id).get();
	}

	@Override
	public Interview update(long id, Interview interview) {
		Interview interviewer = interviewRepository.findById(id).get();
		//System.out.println("id--"+id);
		if(interviewer != null) {
			interviewer.setCandidateId(interview.getCandidateId());
			interviewer.setStartTime(interview.getStartTime());
			interviewer.setEndTime(interview.getEndTime());
			interviewer.setInterviewerId(interview.getInterviewerId());
			interviewer.setResult(interview.getResult());
			interviewer.setInterviewMode(interview.getInterviewMode());
			interviewer.setRemarks(interview.getRemarks());
			interviewer.setInterviewDate(interview.getInterviewDate());
			interviewRepository.save(interviewer);
		}else {
			throw new DataNotFoundException("Not found");
		}
		return interviewer;
	}
}
