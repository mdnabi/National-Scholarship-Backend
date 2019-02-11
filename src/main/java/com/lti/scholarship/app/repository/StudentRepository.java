package com.lti.scholarship.app.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Student;
@Repository
public class StudentRepository extends GenericRepository {

	//@PersistenceContext  //To create object of EntityManager
	private GenericRepository genericRepository;
	
	@Transactional
	public void add(Student student) {
		genericRepository.store(student);
	}
}
