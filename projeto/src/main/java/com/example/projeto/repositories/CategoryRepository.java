package com.example.projeto.repositories;

import com.example.projeto.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface CategoryRepository extends JpaRepository <CategoryModel, UUID> {

}

