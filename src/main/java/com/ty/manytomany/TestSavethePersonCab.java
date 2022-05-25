package com.ty.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavethePersonCab {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = new Person();
		person.setName("venki");
		person.setAge(22);
		person.setEmail("vkvenkates@");

		Person person1 = new Person();
		person1.setName("manu");
		person1.setAge(22);
		person1.setEmail("manu@manu");
		List<Person> persons = new ArrayList<Person>();
		persons.add(person);
		persons.add(person1);

		Cab cab = new Cab();
		cab.setDriverName("manoj");
		cab.setCost(250.0);
		cab.setPersons(persons);

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(cab);
		entityTransaction.commit();
	}

}
