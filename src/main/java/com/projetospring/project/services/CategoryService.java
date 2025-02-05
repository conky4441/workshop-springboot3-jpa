package com.projetospring.project.services;

import com.projetospring.project.entities.Category;
import com.projetospring.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


    public List<Category> findAll() {
        return categoryRepository.findAll();

    }

    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);

        return category.get();
    }
}
