package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.product;

public interface ProductRepository extends JpaRepository <product, Integer>{

}
