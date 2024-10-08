package io.rcrr.springboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.rcrr.springboot.domains.Category;
import io.rcrr.springboot.repositories.CategoryRepository;
import io.rcrr.springboot.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
	
	// Using that annotation Spring creates a dependency via dependency injection or control inversion mechanism
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category search(Integer id) {
		Optional<Category> obj = categoryRepository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Type: " + Category.class.getName()));
		
	}
}
