package com.adjecti.recruitment.tracker.model;


import java.sql.Time;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Interview {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "candidateId")
	private Candidate candidateId;
	private long interviewerId;
	private String interviewMode;
	private Time startTime;
	private Time endTime;
	private String remarks;
	private String result;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Candidate getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Candidate candidateId) {
		this.candidateId = candidateId;
	}
	public long getInterviewerId() {
		return interviewerId;
	}
	public void setInterviewerId(long interviewerId) {
		this.interviewerId = interviewerId;
	}
	public String getInterviewMode() {
		return interviewMode;
	}
	public void setInterviewMode(String interviewMode) {
		this.interviewMode = interviewMode;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Interview(long id, Candidate candidateId, long interviewerId, String interviewMode, Time startTime,
			Time endTime, String remarks, String result) {
		super();
		this.id = id;
		this.candidateId = candidateId;
		this.interviewerId = interviewerId;
		this.interviewMode = interviewMode;
		this.startTime = startTime;
		this.endTime = endTime;
		this.remarks = remarks;
		this.result = result;
	}
	public Interview() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Interview [id=" + id + ", candidateId=" + candidateId + ", interviewerId=" + interviewerId
				+ ", interviewMode=" + interviewMode + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", remarks=" + remarks + ", result=" + result + "]";
	}
	
	
}