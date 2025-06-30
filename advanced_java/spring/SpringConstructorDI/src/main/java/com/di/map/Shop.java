package com.di.map;

import java.util.Map;

public class Shop {
	private String shopName;
	private String shopOwner;

	private Map<String, Double> products;

	public Shop(String shopName, String shopOwner, Map<String, Double> products) {
		super();
		this.shopName = shopName;
		this.shopOwner = shopOwner;
		this.products = products;
	}

	public void displayShopInfo() {
		System.out.println("========Shop Info========");
		System.out.println("Shop Name : " + shopName);
		System.out.println("Shop Owner : " + shopOwner);

		System.out.println("========Products========");
		for (Map.Entry<String, Double> product : products.entrySet()) {
			System.out.println("Product : " + product.getKey() + ", Price : " + product.getValue());
		}
	}

	public String getShopName() {
		return shopName;
	}

//	public void setShopName(String shopName) {
//		this.shopName = shopName;
//	}

	public String getShopOwner() {
		return shopOwner;
	}

//	public void setShopOwner(String shopOwner) {
//		this.shopOwner = shopOwner;
//	}

	public Map<String, Double> getProducts() {
		return products;
	}

//	public void setProducts(Map<String, Double> products) {
//		this.products = products;
//	}

}
