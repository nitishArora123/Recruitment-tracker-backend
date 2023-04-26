package com.adjecti.recruitment.tracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RecruitementSource {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recruitementsourceid")
	private long id;
	@Column(name = "recruitementsouce")
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RecruitementSource(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public RecruitementSource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
