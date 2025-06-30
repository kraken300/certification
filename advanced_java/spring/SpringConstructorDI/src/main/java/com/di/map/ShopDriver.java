package com.di.map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config5.xml");

		Shop shop = (Shop) app.getBean("myShop");

//		System.out.println("Shop Name : " + shop.getShopName());
//		System.out.println("Shop Name : " + shop.getShopOwner());
//		System.out.println("Products : " + shop.getProducts());

		shop.displayShopInfo();

		app.close();
	}
}
