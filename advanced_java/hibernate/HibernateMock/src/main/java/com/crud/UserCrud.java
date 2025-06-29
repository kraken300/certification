package com.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Address;
import com.entity.User;

public class UserCrud {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

	public static void insertUser(User user) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		// Use cascade to auto persist
//		List<Address> addresses = user.getAddresses();
//		et.begin();
//
//		for (Address address : addresses) {
//			em.persist(address);
//		}
		et.begin();

		em.persist(user);

		et.commit();

		em.close();
	}

	public static void fetchUser(int uid) {
		EntityManager em = emf.createEntityManager();

		User user = em.find(User.class, uid);

		if (user != null) {
			System.out.println("========User Details=========");
			System.out.println(user);

			System.out.println("========Address Details=========");
			for (Address address : user.getAddresses()) {
				System.out.println(address);
			}
		} else {
			System.out.println("User not found!");
		}
	}

	public static void updateUser(int uid, String name) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		User user = em.find(User.class, uid);

		et.begin();

		if (user != null) {
			user.setName(name);
			em.merge(user);
			et.commit();
			System.out.println("User updated successfully!");
		} else {
			System.out.println("User not found!");
		}

	}

	public static void deleteUser(int uid) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		User user = em.find(User.class, uid);

		et.begin();

		if (user != null) {

			// Use cascade to auto remove
//			List<Address> addresses = user.getAddresses();
//
//			for (Address address : addresses) {
//				em.remove(address);
//			}

			em.remove(user);
			et.commit();
			System.out.println("User deleted successfully!");
		} else {
			System.out.println("User not found!");
		}

	}

	public static void main(String[] args) {

		// ************* TO INSERT USER *************//
		User user1 = new User();
		user1.setUid(1);
		user1.setName("John");
		user1.setPhone(1234567890L);

		Address add1 = new Address(101, "India", "Maharashtra", "Thane", 400601L);
		Address add2 = new Address(102, "India", "Maharashtra", "Mumbai", 400001L);

		add1.setUser(user1);
		add2.setUser(user1);

		user1.setAddresses(Arrays.asList(add1, add2));

//		insertUser(user1);

		// ************* TO FETCH USER *************//
		fetchUser(1);

		// ************* TO UPDATE USER *************//
//		updateUser(1, "James");

		// ************* TO DELETE USER *************//
//		deleteUser(1);
	}
}
