package com.anamika.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Cart {
	
	private int userId;
	@Id
	private int CartId;
	private int noOfItems;
	

}
