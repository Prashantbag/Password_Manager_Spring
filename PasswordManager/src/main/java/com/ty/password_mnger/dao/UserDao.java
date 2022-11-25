package com.ty.password_mnger.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.password_mnger.dto.User;
import com.ty.password_mnger.dto.UserSocial;

@Repository
public class UserDao {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public User saveUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUserbyEmail(String email) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println(email);
		Query query = entityManager.createQuery("Select u from User u where u.email=?1", User.class);
		return (User) query.setParameter(1, email).getSingleResult();

	}

	public User findUserbyId(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User user = entityManager.find(User.class, id);
		if (user != null) {
			return user;

		} else {
			return null;
		}

	}

	public List<User> getAllUsers() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Query query = entityManager.createQuery("Select u from User u");
		List<User> users = query.getResultList();
		return users;
	}


	

	public UserSocial saveUserSocial(UserSocial userSocial) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(userSocial);
		entityTransaction.commit();
		
		return userSocial;
		
	}
}
