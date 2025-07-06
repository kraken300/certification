package com.controller;

import java.util.List;
import java.util.Scanner;

import com.entity.Category;
import com.entity.Product;
import com.repo.CategoryCrud;
import com.repo.ProductCrud;

public class Driver {
	public static void main(String[] args) {
		CategoryCrud category = new CategoryCrud();
		ProductCrud product = new ProductCrud();
		Scanner sc = new Scanner(System.in);

		char choiceYN1 = '\u0000';
		char choiceYN2 = '\u0000';
		char choiceYN3 = '\u0000';

		do {

			System.out.println("Enter 1 for category related operations : ");
			System.out.println("Enter 2 for product related operations : ");
			System.out.println("Enter 3 to exit : ");

			int choice1 = sc.nextInt();

			switch (choice1) {
			// ================== Category Related Operations====================//
			case 1: {

				choiceYN2 = '\u0000';

				do {

					System.out.println("Enter 1 to add a category : ");
					System.out.println("Enter 2 to fetch a category : ");
					System.out.println("Enter 3 to update a category : ");
					System.out.println("Enter 4 to remove a category : ");
					System.out.println("Enter 5 to fetch all categories : ");
					System.out.println("Enter 6 to exit : ");

					int choice2 = sc.nextInt();

					switch (choice2) {

					case 1: {
						System.out.print("Enter category id : ");
						int id = sc.nextInt();

						System.out.println("Enter category name : ");
						String name = sc.next();

						String message = category.addCatgeory(new Category(id, name));
						System.out.println(message);
						break;
					}

					case 2: {
						System.out.print("Enter category id : ");
						int id = sc.nextInt();

						Category fetchCategory = category.fetchCategory(id);
						if (fetchCategory != null) {
							System.out.println(fetchCategory);
						} else {
							System.out.println("Category not found!");
						}
						break;
					}

					case 3: {
						System.out.print("Enter category id to update: ");
						int id = sc.nextInt();

						System.out.println("Enter new category name : ");
						String newName = sc.next();

						String message = category.updateCategory(id, newName);
						System.out.println(message);
						break;
					}

					case 4: {
						System.out.print("Enter category id to delete: ");
						int id = sc.nextInt();

						String message = category.deleteCategory(id);
						System.out.println(message);
						break;
					}

					case 5: {
						category.fetchAllCategories();
						break;
					}

					case 6: {
						return;
					}

					default: {
						System.out.println("Wrong input");
						System.out.println("Do you want to continue? (Y or N)");
						choiceYN2 = sc.next().charAt(0);
					}

					}
				} while (choiceYN2 == 'Y' || choiceYN2 == 'y');

				break;
			}

			// ================== Product Related Operations====================//
			case 2: {
//				char choiceYN2 = '\u0000';

				do {

					System.out.println("Enter 1 to add a product : ");
					System.out.println("Enter 2 to fetch a product : ");
					System.out.println("Enter 3 to update a product : ");
					System.out.println("Enter 4 to remove a product : ");
					System.out.println("Enter 5 to fetch all products : ");
					System.out.println("Enter 6 to fetch products by category id: ");
					System.out.println("Enter 7 to exit : ");

					int choice3 = sc.nextInt();

					switch (choice3) {

					case 1: {
						System.out.print("Enter product id : ");
						int id = sc.nextInt();

						System.out.println("Enter product name : ");
						String name = sc.next();

						System.out.println("Enter product description : ");
						String description = sc.next();

						System.out.println("Enter product price : ");
						Double price = sc.nextDouble();

						System.out.println("Enter catgegory id to set for product : ");
						int category_id = sc.nextInt();

						Category fetchCategory = category.fetchCategory(category_id);

						Product prod = new Product(id, name, description, price);
						prod.setCategory(fetchCategory);

						String message = product.addProduct(prod);
						System.out.println(message);
						break;
					}

					case 2: {
						System.out.print("Enter product id : ");
						int id = sc.nextInt();

						Product fetchProduct = product.fetchProduct(id);
						if (fetchProduct != null) {
							System.out.println(fetchProduct);
						} else {
							System.out.println("Product not found!");
						}
						break;
					}

					case 3: {
						System.out.print("Enter product id to update: ");
						int id = sc.nextInt();

						System.out.println("Enter new product name : ");
						String newName = sc.next();

						String message = product.updateProduct(id, newName);
						System.out.println(message);
						break;
					}

					case 4: {
						System.out.print("Enter product id to delete: ");
						int id = sc.nextInt();

						String message = product.deleteProduct(id);
						System.out.println(message);
						break;
					}

					case 5: {
						List<Product> products = product.fetchAllProducts();

						for (Product prod : products) {
							System.out.println(prod);
						}
						break;
					}

					case 6: {
						System.out.println("Enter category id : ");
						int id = sc.nextInt();
						
						List<Product> products = product.fetchAllProductsByCategoryId(id);

						for (Product prod : products) {
							System.out.println(prod);
						}
						break;
					}

					case 7: {
						return;
					}

					default: {
						System.out.println("Wrong input");
						System.out.println("Do you want to continue? (Y or N)");
						choiceYN2 = sc.next().charAt(0);
					}

					}
				} while (choiceYN3 == 'Y' || choiceYN3 == 'y');

				break;
			}

			case 3: {
				return;
			}

			default: {
				System.out.println("Wrong input");
				System.out.println("Do you want to continue? (Y or N)");
				choiceYN1 = sc.next().charAt(0);
			}
			}

		} while (choiceYN1 == 'Y' || choiceYN1 == 'y');

		sc.close();

	}
}
