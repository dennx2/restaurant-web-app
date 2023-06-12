package com.dennx2.j2ee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dennx2.j2ee.model.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {
	
	
	
	
	
}
