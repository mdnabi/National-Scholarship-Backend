package com.lti.scholarship.app.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.repository.GenericRepository;
import com.lti.scholarship.app.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private GenericRepository genericRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Transactional
	public void add(Student student) {
		System.out.println("service called");
		genericRepository.store(student);
	}
	
	@Transactional
	public Student verify(Student student) {
	 Student stud;
	 String uname=student.getAdharNo();
	 String passwd=student.getPassword();
	 stud=studentRepository.verify(uname, passwd);
	 System.out.println("going to controller");
	 return stud; 
	 
	}

}
