package com.lti.scholarship.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Student;
@Repository
public class StudentRepository extends GenericRepository {

	@PersistenceContext  
	private EntityManager em;
	
	private GenericRepository genericRepository;
	
	@Transactional
	public void add(Student student) {
		genericRepository.store(student);
	}
	
	@Transactional
	public  Student verify(String adharNo,String password) {
		Student st;
		Query q=em.createQuery("from Student as  s where s.adharNo=?1 and s.password=?2 ");
		q.setParameter(1, adharNo);
		q.setParameter(2, password);
		System.out.println("student repository called");
		System.out.println(adharNo);
		System.out.println(password);
		try {
		st=(Student)q.getSingleResult();
		}
		catch(Exception e) {
			st=null;
		}
		return st;
		
	}
}
