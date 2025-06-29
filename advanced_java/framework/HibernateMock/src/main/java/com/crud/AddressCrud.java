package com.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Address;
import com.entity.User;

public class AddressCrud {
	public static void insertAddress(Address newAddress, int uid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		User user = em.find(User.class, uid);
		et.begin();

		if (user != null) {
			newAddress.setUser(user);

//			List<Address> addresses = user.getAddresses();
//			addresses.add(newAddress);
//			user.setAddresses(addresses);

			em.merge(user);
			em.persist(newAddress);

			System.out.println("Address inserted successfully!");
		} else {
			System.out.println("User not found!");
		}

		em.persist(user);

		et.commit();
	}

	public static void fetchAddress(int aid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Address address = em.find(Address.class, aid);

		if (address != null) {
			System.out.println("========Address Details=========");
			System.out.println(address);

			System.out.println("========User Details=========");
			System.out.println(address.getUser());
		} else {
			System.out.println("Address not found!");
		}
	}

	public static void updateAddress(int aid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Address address = em.find(Address.class, aid);

		et.begin();

		if (address != null) {
			address.setCity("Nagpur");
			em.merge(address);
			System.out.println("Address updated successfully!");
		} else {
			System.out.println("Address not found!");
		}

		et.commit();
	}

	public static void deleteAddress(int aid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Address address = em.find(Address.class, aid);

		et.begin();

		if (address != null) {
			em.remove(address);
			System.out.println("Address deleted successfully!");
		} else {
			System.out.println("Address not found!");
		}

		et.commit();
	}

	public static void main(String[] args) {

		// ************* TO INSERT USER *************//

		Address add1 = new Address(103, "India", "Maharashtra", "Pune", 422032L);

		insertAddress(add1, 1);

		// ************* TO FETCH USER *************//
//		fetchAddress(101);

		// ************* TO UPDATE USER *************//
//		updateAddress(101);

		// ************* TO DELETE USER *************//
//		deleteAddress(102);
	}
}
