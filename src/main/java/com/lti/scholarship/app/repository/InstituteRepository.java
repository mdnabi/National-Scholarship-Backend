package com.lti.scholarship.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Institute;

@Repository
public class InstituteRepository extends GenericRepository {
	
	//@PersistenceContext  //To create object of EntityManager
	private GenericRepository genericRepository;
	
	@Transactional
	public void add(Institute institute) {
		genericRepository.store(institute);
	}
	
	
}
