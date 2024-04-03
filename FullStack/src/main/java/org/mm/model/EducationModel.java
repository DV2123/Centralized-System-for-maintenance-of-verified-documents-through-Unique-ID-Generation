package org.mm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "education")
public class EducationModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String tenSchoolName;
	
	@Column
	private String tenPassYear;
	
	@Column
	private int tenPercentage;
	
	@Column
	private String twelSchoolName;
	
	@Column
	private String twelPassYear;
	
	@Column
	private int twelPercentage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenSchoolName() {
		return tenSchoolName;
	}

	public void setTenSchoolName(String tenSchoolName) {
		this.tenSchoolName = tenSchoolName;
	}

	public String getTenPassYear() {
		return tenPassYear;
	}

	public void setTenPassYear(String tenPassYear) {
		this.tenPassYear = tenPassYear;
	}

	public int getTenPercentage() {
		return tenPercentage;
	}

	public void setTenPercentage(int tenPercentage) {
		this.tenPercentage = tenPercentage;
	}

	public String getTwelSchoolName() {
		return twelSchoolName;
	}

	public void setTwelSchoolName(String twelSchoolName) {
		this.twelSchoolName = twelSchoolName;
	}

	public String getTwelPassYear() {
		return twelPassYear;
	}

	public void setTwelPassYear(String twelPassYear) {
		this.twelPassYear = twelPassYear;
	}

	public int getTwelPercentage() {
		return twelPercentage;
	}

	public void setTwelPercentage(int twelPercentage) {
		this.twelPercentage = twelPercentage;
	}

	public EducationModel(int id, String tenSchoolName, String tenPassYear, int tenPercentage, String twelSchoolName,
			String twelPassYear, int twelPercentage) {
		super();
		this.id = id;
		this.tenSchoolName = tenSchoolName;
		this.tenPassYear = tenPassYear;
		this.tenPercentage = tenPercentage;
		this.twelSchoolName = twelSchoolName;
		this.twelPassYear = twelPassYear;
		this.twelPercentage = twelPercentage;
	}

	public EducationModel(String tenSchoolName, String tenPassYear, int tenPercentage, String twelSchoolName,
			String twelPassYear, int twelPercentage) {
		super();
		this.tenSchoolName = tenSchoolName;
		this.tenPassYear = tenPassYear;
		this.tenPercentage = tenPercentage;
		this.twelSchoolName = twelSchoolName;
		this.twelPassYear = twelPassYear;
		this.twelPercentage = twelPercentage;
	}

	public EducationModel() {
		super();
	}
	
}
