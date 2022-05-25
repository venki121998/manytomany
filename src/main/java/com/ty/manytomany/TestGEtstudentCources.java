package com.ty.manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGEtstudentCources {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student student= entityManager.find(Student.class,1);
		if(student!= null){
			List<Courses> courses=student.getCourses();
			System.out.println("student name is "+student.getName());
			System.out.println("Stduent age is"+student.getAge());
			System.out.println("===========courses===============");
			for (Courses courses2 : courses) {
				
			System.out.println("courses name is "+courses2.getName());
			System.out.println("courses duration "+courses2.getDuration());
			}
		}
		
	}

}
