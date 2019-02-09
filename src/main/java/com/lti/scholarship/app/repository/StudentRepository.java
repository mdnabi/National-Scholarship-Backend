package com.lti.scholarship.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.lti.scholarship.app.entity.Student;

@Repository
public class StudentRepository {
	@PersistenceContext  //To create object of EntityManager
	private EntityManager entityManager;

	public void add(Student student) {
		entityManager.persist(student);
	}

	public Student fetchById(long adharno) {
		return entityManager.find(Student.class, adharno);

	}

}
