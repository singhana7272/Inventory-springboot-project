package com.anamika.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anamika.bean.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
