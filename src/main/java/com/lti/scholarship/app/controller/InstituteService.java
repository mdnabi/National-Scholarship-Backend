package com.lti.scholarship.app.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class InstituteService {

	@Autowired
	private GenericRepository genericRepository;

	@Transactional
	public void add(Institute institute) {
		System.out.println("service called");
		genericRepository.store(institute);
	}
	
	@Transactional
	public Institute fetchById(int id) {
		return genericRepository.fetchById(Institute.class, id);
	}               
	
	
}
