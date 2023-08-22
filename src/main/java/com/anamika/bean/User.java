package com.anamika.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int userId;
	private String username;
	private int noOfProductBought;
	

}
