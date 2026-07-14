package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/newCategory")
        public String newCategory(@RequestBody String body){
        return categoryService.newCategory(body);
    }
}
