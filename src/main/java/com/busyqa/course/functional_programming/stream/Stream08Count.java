package com.busyqa.course.functional_programming.stream;

import java.util.*;

class Product7 {
	int id;
	String name;
	float price;

	public Product7(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Stream08Count {
	public static void main(String[] args) {
		List<Product7> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product7(1, "HP Laptop", 25000f));
		productsList.add(new Product7(2, "Dell Laptop", 30000f));
		productsList.add(new Product7(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product7(4, "Sony Laptop", 28000f));
		productsList.add(new Product7(5, "Apple Laptop", 90000f));
		// count number of products based on the filter
		long count = productsList.stream().filter(product -> product.price < 30000).count();
		System.out.println(count);
	}
}
