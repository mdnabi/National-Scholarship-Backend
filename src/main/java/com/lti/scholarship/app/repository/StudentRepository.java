package com.lti.scholarship.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.lti.scholarship.app.entity.Student;

@Repository
public class StudentRepository {
	@PersistenceContext  //To create object of EntityManager
	private EntityManager entityManager;

	@Transactional
	public void add(Student student) {
		entityManager.persist(student);
	}
	
	@Transactional
	public Student fetchById(long adharno) {
		return entityManager.find(Student.class, adharno);

	}

}
