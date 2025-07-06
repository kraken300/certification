package com.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.Product;

public class ProductCrud {
	public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	public static final EntityManager em = emf.createEntityManager();
	public static final EntityTransaction et = em.getTransaction();

	// ************* To add a product *************//
	public String addProduct(Product product) {

		if (product != null) {
			try {
				et.begin();
				em.persist(em.merge(product));
				et.commit();
				return "Product added successfully!";
			} catch (Exception e) {
				e.printStackTrace();
				return "Could not add product!";
			}
		}

		return "Product is null";
	}

	// ************* To fetch a product *************//
	public Product fetchProduct(Integer pid) {
		return em.find(Product.class, pid);
	}

	// ************* To fetch all products *************//
	public List<Product> fetchAllProducts() {
		String hql = "SELECT p FROM Product p";
//		 System.out.println(em.createQuery(hql));

		Query query = em.createQuery(hql);
		List<Product> products = query.getResultList();

		return products;
	}

	// ************* To fetch all products by category id *************//
	public List<Product> fetchAllProductsByCategoryId(Integer cid) {
		String hql = "SELECT p FROM Product p WHERE p.category.cid =: cid";
		Query query = em.createQuery(hql);
		query.setParameter("cid", cid);
		return query.getResultList();
	}

	// ************* To update a product *************//
	public String updateProduct(Integer pid, String name) {
		Product product = em.find(Product.class, pid);

		if (product != null) {
			try {
				product.setName(name);
				et.begin();
				em.merge(product);
				et.commit();
				return "Product updated!";
			} catch (Exception e) {
				e.printStackTrace();
				return "Could not update the product!";
			}
		}

		return "Product not found";
	}

	// ************* To delete a product *************//
	public String deleteProduct(Integer pid) {
		Product product = em.find(Product.class, pid);

		if (product != null) {
			try {
				et.begin();
				em.remove(product);
				et.commit();
				return "Product deleted succesfully";
			} catch (Exception e) {
				e.printStackTrace();
				return "Could not delete the product!";
			}
		}

		return "Product not found";
	}

}
