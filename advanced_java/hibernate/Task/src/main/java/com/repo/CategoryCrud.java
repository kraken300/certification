package com.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.Category;

public class CategoryCrud {
	public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	public static final EntityManager em = emf.createEntityManager();
	public static final EntityTransaction et = em.getTransaction();

	public CategoryCrud() {

	}

	// ************* To add a category *************//
	public String addCatgeory(Category category) {
		if (category != null) {
			try {
				et.begin();
				em.persist(em.merge(category));
				et.commit();
				return "Category added successfully!";
			} catch (Exception e) {
				e.printStackTrace();
				return "Could not add Category";
			}
		}
		return "Category is null";
	}

	// ************* To fetch a category *************//
	public Category fetchCategory(Integer cid) {
		return em.find(Category.class, cid);
	}

	// ************* To fetch all categories *************//
	public void fetchAllCategories() {
		String hql = "SELECT c FROM Category c";
		Query query = em.createQuery(hql);

		List<Category> categories = query.getResultList();
		for (Category category : categories) {
			System.out.println(category);
		}
	}

	// ************* To update a category *************//
	public String updateCategory(Integer cid, String name) {
		Category category = em.find(Category.class, cid);

		if (category != null) {
			try {
				category.setName(name);
				et.begin();
				em.merge(category);
				et.commit();
				return "Category updated successfully!";
			} catch (Exception e) {
				e.printStackTrace();
				return "Could not update Category!";
			}
		}
		return "Category not found!";
	}

	// ************* To delete a category *************//
	public String deleteCategory(Integer cid) {
		Category category = em.find(Category.class, cid);

		if (category != null) {
			try {
				et.begin();
				em.remove(category);
				et.commit();
				return "Category deleted successfully!";
			} catch (Exception e) {
				e.printStackTrace();
				return "Could not delete Category!";
			}
		}
		return "Category not found!";
	}
}
