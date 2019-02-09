package com.lti.scholarship.app.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
	private StudentRepository studentRepository;

	@Transactional
	public void add(Student student) {
		studentRepository.add(student);
	}

	public Student fetch(long adharno) {
		return studentRepository.fetchById(adharno);
	}                                                           


}
