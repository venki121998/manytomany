package com.ty.manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ToGetthePersonCab {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Cab cab=entityManager.find(Cab.class, 1);
		if(cab!=null){
			List<Person>persons=cab.getPersons();
			for (Person person : persons) {
				System.out.println(person.getName());
				System.out.println(person.getEmail());
			}
			System.out.println(cab.getDriverName());
		}
		else
		{
			System.out.println("id is not found");
		}
	}

}
