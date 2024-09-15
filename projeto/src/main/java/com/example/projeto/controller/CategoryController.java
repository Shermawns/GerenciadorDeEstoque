package com.example.projeto.controller;

import com.example.projeto.models.CategoryModel;
import com.example.projeto.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping
    public ResponseEntity<CategoryModel> createCategory(@RequestBody CategoryModel categoryModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryRepository.save(categoryModel));
    }

    @GetMapping
    public ResponseEntity<List<CategoryModel>> getAllCategories(){
        List<CategoryModel> category = categoryRepository.findAll();
            if (category.isEmpty()){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
            }
                return ResponseEntity.status(HttpStatus.OK).body(categoryRepository.findAll());
}
}