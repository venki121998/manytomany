package com.ty.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavetheStudentCource {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student = new Student();
		student.setName("divya");
		student.setAge(22);
		Courses courses1= entityManager.find(Courses.class, 2);
		Courses courses2= entityManager.find(Courses.class, 3);
		List<Courses> courses = new ArrayList<Courses>();
		student.setCourses(courses);
		
	
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(courses1);
		entityManager.persist(courses2);
		entityTransaction.commit();
	}
}
