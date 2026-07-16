package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.database.models.CategoryEntity;
import com.vmdgab.Spring_App.dto.CategoryDTO;
import com.vmdgab.Spring_App.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryEntity> getAll(){
        return categoryService.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
        public void newCategory(@RequestBody CategoryDTO body){
            categoryService.newCategory(body);
        }
}
