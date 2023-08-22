package com.anamika.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anamika.bean.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {
	
	

}
