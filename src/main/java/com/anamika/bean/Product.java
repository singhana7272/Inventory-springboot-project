package com.anamika.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int productId;
	private String productName;
	private int quantity;

}
