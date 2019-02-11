package com.lti.scholarship.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TBL_INSTITUTE")
public class Institute {
	@Id
	@GeneratedValue
	private int instituteId;
	
	private String institutionCode;
	private String institutionName;
	private String state;
	private String diseCodeOfInstitute;
	private String universityState;
	private String universityName;
	private String password;
	private String instituteEstCertificate;
	private String universityCertificate;
	
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstitutionCode() {
		return institutionCode;
	}
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDiseCodeOfInstitute() {
		return diseCodeOfInstitute;
	}
	public void setDiseCodeOfInstitute(String diseCodeOfInstitute) {
		this.diseCodeOfInstitute = diseCodeOfInstitute;
	}
	public String getUniversityState() {
		return universityState;
	}
	public void setUniversityState(String universityState) {
		this.universityState = universityState;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getInstituteEstCertificate() {
		return instituteEstCertificate;
	}
	public void setInstituteEstCertificate(String instituteEstCertificate) {
		this.instituteEstCertificate = instituteEstCertificate;
	}
	public String getUniversityCertificate() {
		return universityCertificate;
	}
	public void setUniversityCertificate(String universityCertificate) {
		this.universityCertificate = universityCertificate;
	}

	

	
}
