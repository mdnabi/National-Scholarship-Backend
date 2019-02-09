package com.example;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NationalScholarshipApplicationTests {
@Autowired
StudentRepository studentRepository;
	/*@Test
	public void contextLoads() {
	}*/
	@Test
	@Transactional
	public void addStudent() {
		Student student = new Student();
		//student.setAdharno(23456543);
		student.setStateofdomicile("Maharashtra");
		student.setName("Bob");
		student.setGender("Male");
		student.setMobileno("1234567890");
		student.setEmail("abc@gmail.com");
		student.setInstitutecode("AC505");
		
		studentRepository.add(student);
	}


}

