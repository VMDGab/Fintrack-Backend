package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping("/newCategory")
        public ResponseEntity<String> newCategory(@RequestBody String body){
            return new ResponseEntity<>(categoryService.newCategory(body), HttpStatus.CREATED);
        }
}
