package com.controller;

import java.util.Scanner;

import com.entity.Category;
import com.entity.Product;
import com.repo.CategoryCrud;
import com.repo.ProductCrud;

public class DriverDemo {
	public static void main(String[] args) {
		CategoryCrud category = new CategoryCrud();
		ProductCrud product = new ProductCrud();

		// ************* Food Products *************

//		Category catg1 = new Category(1, "Food");
//		Product p1 = new Product(101, "Chips", "Fresh and Crispy", 20.0);
//		p1.setCategory(catg1);
//		Product p2 = new Product(102, "Cheese Cake", "Sweet and Cheesey", 30.0);
//		p2.setCategory(catg1);
//
//		String m1 = product.addProduct(p1);
//		String m2 = product.addProduct(p2);
//		String m3 = category.addCatgeory(catg1);
//
//		System.out.println(m1);
//		System.out.println(m2);
//		System.out.println(m3);

		// ************* Electronic Products *************

		Category catg1 = new Category(2, "Electronics");
		Product p1 = new Product(103, "Phone", "Good camera quality!", 20000.0);
		p1.setCategory(catg1);
		Product p2 = new Product(104, "Headphones", "Good sound quality!", 2000.0);
		p2.setCategory(catg1);

//		String m1 = product.addProduct(p1);
//		String m2 = product.addProduct(p2);
//		String m3 = category.addCatgeory(catg1);

//		System.out.println(m1);
//		System.out.println(m2);
//		System.out.println(m3);

		// ************* Fetch all products by cateogry id*************
//		product.fetchAllProductsByCategoryId(2);

//		Category catg2 = new Category("Electronics");
//		String message2 = category.addCatgeory(catg2);
//		System.out.println(message2);

//		Category fetchedCategory = category.fetchCategory(2);
//		if (fetchedCategory != null) {
//			System.out.println(fetchedCategory);
//		} else {
//			System.out.println("Category not found!s");
//		}

//		String updateMessage = category.updateCategory(2, "Clothes");
//		System.out.println(updateMessage);

//		String deletedMessage = category.deleteCategory(2);
//		System.out.println(deletedMessage);

//		category.fetchAllCategories();

//		Product prod1 = new Product("Chocolate", "Sweet and Tasty", 20.0);
//		String message = product.addProduct(prod1);
//		System.out.println(message);

//		Product fetchedProduct = product.fetchProduct(2);
//		if (fetchedProduct != null) {
//			System.out.println(fetchedProduct);
//		} else {
//			System.out.println("Product not found!");
//		}

//		String updateMessage = product.updateProduct(2, "Biscuits");
//		System.out.println(updateMessage);

//		String deleteMessage = product.deleteProduct(2);
//		System.out.println(deleteMessage);

//		product.fetchAllProducts();

		Scanner sc = new Scanner(System.in);



		while (true) {
			System.out.println("Enter choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				demoMethod1();
				break;
			}

			case 2: {
				demoMethod2();
				break;
			}
			default: {
				return;
			}
			}
		}

	}

	public static void demoMethod1() {
		System.out.println("Demo method 1");
	}

	public static void demoMethod2() {
		System.out.println("Demo method 2");
	}
}
