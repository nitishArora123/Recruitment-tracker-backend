package com.adjecti.recruitment.tracker.model;
import java.util.Date;



import com.adjecti.recruitment.tracker.enumerator.HiringChannel;
import com.adjecti.recruitment.tracker.enumerator.HiringType;
import com.adjecti.recruitment.tracker.enumerator.VacancyStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="vacancy")
public class Vacancy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="vacancyId")
	private long id;
	private long departmentId;
	private long designationId;
	private int noOfVacancy;
	private Date openingDate;
	
	@Enumerated(EnumType.STRING)
	private VacancyStatus status;
	
	private Date startDate;
	private Date endDate;
	
	@Enumerated(EnumType.STRING)
	private HiringType hiringType;
	
	@Enumerated(EnumType.STRING)
	private HiringChannel hiringChannel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public long getDesignationId() {
		return designationId;
	}

	public void setDesignationId(long designationId) {
		this.designationId = designationId;
	}

	public int getNoOfVacancy() {
		return noOfVacancy;
	}

	public void setNoOfVacancy(int noOfVacancy) {
		this.noOfVacancy = noOfVacancy;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public VacancyStatus getStatus() {
		return status;
	}

	public void setStatus(VacancyStatus status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public HiringType getHiringType() {
		return hiringType;
	}

	public void setHiringType(HiringType hiringType) {
		this.hiringType = hiringType;
	}

	public HiringChannel getHiringChannel() {
		return hiringChannel;
	}

	public void setHiringChannel(HiringChannel hiringChannel) {
		this.hiringChannel = hiringChannel;
	}

	public Vacancy(long id, long departmentId, long designationId, int noOfVacancy, Date openingDate,
			VacancyStatus status, Date startDate, Date endDate, HiringType hiringType, HiringChannel hiringChannel) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.designationId = designationId;
		this.noOfVacancy = noOfVacancy;
		this.openingDate = openingDate;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hiringType = hiringType;
		this.hiringChannel = hiringChannel;
	}

	public Vacancy() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vacancy [id=" + id + ", departmentId=" + departmentId + ", designationId=" + designationId
				+ ", noOfVacancy=" + noOfVacancy + ", openingDate=" + openingDate + ", status=" + status
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", hiringType=" + hiringType
				+ ", hiringChannel=" + hiringChannel + "]";
	}
	
	
	
	
	
	

}
