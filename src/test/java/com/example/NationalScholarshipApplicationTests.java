package com.example;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.scholarship.app.NationalScholarshipApplication;
import com.lti.scholarship.app.controller.InstituteService;
import com.lti.scholarship.app.controller.StudentService;
import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NationalScholarshipApplication.class)
@Rollback(false)
public class NationalScholarshipApplicationTests {
	@Autowired
	StudentService studentService;

	@Autowired
	InstituteService instituteService;

	@Test
	@Transactional
	public void addStudent() {
		// Test case 1
		Student student = new Student();
		/*
		 * student.setAdharno("845769582143");
		 * student.setStateofdomicile("Maharashtra"); student.setName("Bob");
		 * student.setGender("Male"); student.setMobileno("1234567890");
		 * student.setEmail("abc@gmail.com"); student.setInstitutecode("AC505");
		 * System.out.println("student test called"); studentService.add(student);
		 */

		// Test case 2
		/*
		 * student.setAdharno("7458965475"); student.setStateofdomicile("Bangalore");
		 * student.setName("Nabi"); student.setGender("Male");
		 * student.setMobileno("9856325874"); student.setEmail("xyz@gmail.com");
		 * student.setInstitutecode("AC505"); System.out.println("student test called");
		 * studentService.add(student);
		 */
		// Test case 3
		/*
		 * student.setAdharno("5458965475"); student.setStateofdomicile("Bangal");
		 * student.setName("Nabeel"); student.setGender("Male");
		 * student.setMobileno("7856325874"); student.setEmail("lntMail@gmail.com");
		 * student.setInstitutecode("AC505"); System.out.println("student test called");
		 * studentService.add(student);
		 */

		// Test case 4
		/*
		 * student.setAdharno("6458965475"); student.setStateofdomicile("andhra");
		 * student.setName("Najeeb"); student.setGender("Male");
		 * student.setMobileno("6856325874"); student.setEmail("najeeb@gmail.com");
		 * student.setInstitutecode("AC505"); System.out.println("student test called");
		 * studentService.add(student);
		 */

		// Test case 5
		/*
		 * student.setAdharno("3458965475"); student.setStateofdomicile("karnataka");
		 * student.setName("Naajar"); student.setGender("Male");
		 * student.setMobileno("5856325874"); student.setEmail("naajar@gmail.com");
		 * student.setInstitutecode("AC505"); System.out.println("student test called");
		 * studentService.add(student);
		 */

		// Test case 6
		/*
		 * student.setAdharno("1458965475"); student.setStateofdomicile("tamilnaadu");
		 * student.setName("srikanth"); student.setGender("Male");
		 * student.setMobileno("3856325874"); student.setEmail("sri@gmail.com");
		 * student.setInstitutecode("AC505"); System.out.println("student test called");
		 * studentService.add(student);
		 */

	}

	@Test
	@Transactional
	public void fetchById() {
		Student student = studentService.fetchById(1);
		System.out.println(student.getAdharno());
		assertEquals("845769582143", student.getAdharno());
		// assertEquals("abc@gmail.com", student.getEmail());
		// assertEquals("AC505", student.getInstitutecode());
		// assertEquals("1234567890", student.getMobileno());
		// assertEquals("Maharashtra", student.getStateofdomicile());
		// System.out.println(student.getEmail());

		// Student student=studentService.fetchById(2);
		// assertEquals("4458965475", student.getAdharno());
		// assertEquals("xyz@gmail.com", student.getEmail());
		// assertEquals("AC505", student.getInstitutecode());
		// assertEquals("9856325874", student.getMobileno());
		// assertEquals("Maharashtra", student.getStateofdomicile());

		// Student student=studentService.fetchById(4);
		// assertEquals("6458965475", student.getAdharno());
		// assertEquals("najeeb@gmail.com", student.getEmail());
		// assertEquals("AC505", student.getInstitutecode());
		// assertEquals("6856325874", student.getMobileno());
		// assertEquals("andhra", student.getStateofdomicile());

		// Student student=studentService.fetchById(5);
		// assertEquals("3458965475", student.getAdharno());
		// assertEquals("naajar@gmail.com", student.getEmail());
		// assertEquals("AC505", student.getInstitutecode());
		// assertEquals("5856325874", student.getMobileno());
		// assertEquals("karnataka", student.getStateofdomicile());

	}

	@Test
	@Transactional
	public void addInstitute() {
		Institute institute = new Institute();
		/*institute.setDiseCodeOfInstitute("123");
		institute.setInstituteEstCertificate("andhraprad");
		institute.setInstitutionCode("112");
		institute.setInstitutionName("nimra ");
		institute.setState("andhr");
		institute.setUniversityCertificate("sdfgd");
		institute.setUniversityName("jntuka");
		institute.setUniversityState("andhra");
		System.out.println(institute.getDiseCodeOfInstitute());
		instituteService.add(institute);*/
		

		/*institute.setDiseCodeOfInstitute("124");
		institute.setInstituteEstCertificate("up");
		institute.setInstitutionCode("1113");
		institute.setInstitutionName("nimra institute ");
		institute.setState("utharpradesh");
		institute.setUniversityCertificate("sdfgdsfs");
		institute.setUniversityName("jntum");
		institute.setUniversityState("up");
		System.out.println(institute.getDiseCodeOfInstitute());
		instituteService.add(institute);*/
		
		/*institute.setDiseCodeOfInstitute("125");
		institute.setInstituteEstCertificate("andhra");
		institute.setInstitutionCode("114");
		institute.setInstitutionName("nimra engg ");
		institute.setState("andhra");
		institute.setUniversityCertificate("sdfgnjj");
		institute.setUniversityName("jntukh");
		institute.setUniversityState("andhraPradesh");
		System.out.println(institute.getDiseCodeOfInstitute());
		instituteService.add(institute);*/
		
		/*institute.setDiseCodeOfInstitute("126");
		institute.setInstituteEstCertificate("bihar");
		institute.setInstitutionCode("115");
		institute.setInstitutionName("shiksha abhiyan ");
		institute.setState("bihar");
		institute.setUniversityCertificate("jj");
		institute.setUniversityName("jntub");
		institute.setUniversityState("bihar");
		System.out.println(institute.getDiseCodeOfInstitute());
		instituteService.add(institute);*/
		
	}
	@Test
	@Transactional
	public void fetchByinstituteId() {
		/*Institute institute = instituteService.fetchById(52);
		System.out.println(institute.getUniversityName());
		assertEquals("115", institute.getInstitutionCode());*/
		
		/*Institute institute = instituteService.fetchById(51);
		System.out.println(institute.getUniversityName());
		assertEquals("nimra engg", institute.getInstitutionName());*/
		/*
		Institute institute = instituteService.fetchById(50);
		System.out.println(institute.getUniversityName());
		assertEquals("jntum", institute.getUniversityName());*/
		
		}

}
