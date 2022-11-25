package com.ty.password_mnger.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.ty.password_mnger.dto.User;


public class UserDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	public void delete (int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = entityManager.find(User.class, id);
		if (id != 0) {

			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();

		} else {
			System.out.println("User not found");
		}
	}
	
	public User update (User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
		return user;
	}

}
