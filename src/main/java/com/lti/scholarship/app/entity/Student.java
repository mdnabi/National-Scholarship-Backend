package com.lti.scholarship.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_STUDENT")
public class Student {

	@Id
	@GeneratedValue
	private int student_id;
	
	private String adharno;
	
	private String stateofdomicile;
	private String name;
	private String gender;
	private String mobileno;
	private String email;
	private String institutecode;



	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStateofdomicile() {
		return stateofdomicile;
	}

	public void setStateofdomicile(String stateofdomicile) {
		this.stateofdomicile = stateofdomicile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInstitutecode() {
		return institutecode;
	}

	public void setInstitutecode(String institutecode) {
		this.institutecode = institutecode;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

	@Override
	public String toString() {
		return "Student [adharno=" + adharno + ", stateofdomicile=" + stateofdomicile + ", name=" + name + ", gender="
				+ gender + ", mobileno=" + mobileno + ", email=" + email + ", institutecode=" + institutecode + "]";
	}
	
}
