package com.ishnit.bookstoreapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ishnit.bookstoreapp.entity.Category;

@RepositoryRestResource(collectionResourceRel = "book", path="book-category")
public interface BookCategoryRepository extends JpaRepository<Category, Long> {}

