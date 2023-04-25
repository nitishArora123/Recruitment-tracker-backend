package com.adjecti.recuritment.tracker.model;

import java.io.File;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="candidateId")
	private long id;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private long designationId;
	private long recruiterId;
	private long recruitmentSourceId;
	private Date appliedDate;
	private long selectionPhaseId;
	private String comments;
	private long mobile;
	private String address;
	private File resume;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(long designationId) {
		this.designationId = designationId;
	}
	public long getRecruiterId() {
		return recruiterId;
	}
	public void setRecruiterId(long recruiterId) {
		this.recruiterId = recruiterId;
	}
	public long getRecruitmentSourceId() {
		return recruitmentSourceId;
	}
	public void setRecruitmentSourceId(long recruitmentSourceId) {
		this.recruitmentSourceId = recruitmentSourceId;
	}
	public Date getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}
	public long getSelectionPhaseId() {
		return selectionPhaseId;
	}
	public void setSelectionPhaseId(long selectionPhaseId) {
		this.selectionPhaseId = selectionPhaseId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public File getResume() {
		return resume;
	}
	public void setResume(File resume) {
		this.resume = resume;
	}
	public Candidate(long id, String firstName, String middleName, String lastName, long designationId,
			long recruiterId, long recruitmentSourceId, Date appliedDate, long selectionPhaseId, String comments,
			long mobile, String address, File resume) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.designationId = designationId;
		this.recruiterId = recruiterId;
		this.recruitmentSourceId = recruitmentSourceId;
		this.appliedDate = appliedDate;
		this.selectionPhaseId = selectionPhaseId;
		this.comments = comments;
		this.mobile = mobile;
		this.address = address;
		this.resume = resume;
	}
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
