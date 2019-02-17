package com.lti.scholarship.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;

@Rollback(false)
@Component
public class GenericRepository {

	@PersistenceContext
	protected EntityManager entityManger;

	@Transactional
	public void store(Object obj) {
		entityManger.merge(obj);
	}

	@Transactional
	public <E> E fetchById(Class<E> classname, Object pk) {
		E e = entityManger.find(classname, pk);
		return e;
	}

	public <E> List<E> fetchAll(Class<E> clazz) {
		Query q = entityManger.createQuery("select obj  from " + clazz.getName() + " as obj");// JPQL
		return q.getResultList();
	}

}
