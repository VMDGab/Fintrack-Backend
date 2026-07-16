package com.vmdgab.Spring_App.services;

import com.vmdgab.Spring_App.database.models.CategoryEntity;
import com.vmdgab.Spring_App.database.repository.ICategoryRepository;
import com.vmdgab.Spring_App.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final ICategoryRepository categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryEntity> findAll(){
        return categoryRepository.findAll();
    }

    public CategoryEntity newCategory(CategoryDTO category){
       return categoryRepository.save(
                CategoryEntity.builder()
                        .title(category.getTitle())
                        .essential(category.getEssential())
                        .build()

        );
    }
}
