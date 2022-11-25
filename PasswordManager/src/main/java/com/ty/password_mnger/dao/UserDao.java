package com.ty.password_mnger.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.password_mnger.dto.UserSocial;

@Repository
public class UserDao {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;

	public UserSocial saveUserSocial(UserSocial userSocial) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(userSocial);
		entityTransaction.commit();
		
		return userSocial;
		
	}
}
