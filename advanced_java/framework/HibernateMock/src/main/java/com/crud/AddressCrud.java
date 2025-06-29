package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Address;
import com.entity.User;

public class AddressCrud {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

	public static void insertAddress(Address newAddress, int uid) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		User user = em.find(User.class, uid);
		et.begin();

		if (user != null) {
			newAddress.setUser(user);

//			List<Address> addresses = user.getAddresses();
//			addresses.add(newAddress);
//			user.setAddresses(addresses);

//			em.merge(user);
			em.persist(newAddress);
			et.commit();
			em.close();
			System.out.println("Address inserted successfully!");
		} else {
			System.out.println("User not found!");
		}

	}

	public static void fetchAddress(int aid) {
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

	public static void updateAddress(int aid, String city) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Address address = em.find(Address.class, aid);

		et.begin();

		if (address != null) {
			address.setCity(city);
			em.merge(address);
			et.commit();
			em.close();
			System.out.println("Address updated successfully!");
		} else {
			System.out.println("Address not found!");
		}

	}

	public static void deleteAddress(int aid) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Address address = em.find(Address.class, aid);

		et.begin();

		if (address != null) {
			em.remove(address);
			et.commit();
			em.close();
			System.out.println("Address deleted successfully!");
		} else {
			System.out.println("Address not found!");
		}

	}

	public static void main(String[] args) {

		// ************* TO INSERT ADDRESS *************//

		Address add1 = new Address(103, "India", "Maharashtra", "Pune", 422032L);

//		insertAddress(add1, 1);

		// ************* TO FETCH ADDRESS *************//
//		fetchAddress(103);

		// ************* TO UPDATE ADDRESS *************//
//		updateAddress(103, "Nagpur");

		// ************* TO DELETE ADDRESS *************//
//		deleteAddress(103);
	}
}
