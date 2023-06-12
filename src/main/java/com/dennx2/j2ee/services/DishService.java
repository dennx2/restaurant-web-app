package com.dennx2.j2ee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennx2.j2ee.model.Dish;
import com.dennx2.j2ee.repository.DishRepository;

@Service
public class DishService {
	
	@Autowired
	private DishRepository dishRepository;
	
//	public List<Dish> getDishes() {
//		return DishRepository.getDishes();
//	}
	
	public List<Dish> getDishes() {
		return this.dishRepository.findAll();
	}
	
//	public Optional<Dish> findDishByNAme(String name) {
//		return DishRepository.getDishes()
//				.stream()
//				.filter(a -> a.getName().equalsIgnoreCase(name))
//				.findFirst();
//	}
	
//	public Optional<Dish> findDishByNAme(String name) {
//		return this.dishRepository.findById(1);
//	}

	


}
