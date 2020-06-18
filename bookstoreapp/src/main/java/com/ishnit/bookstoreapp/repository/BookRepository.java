package com.ishnit.bookstoreapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ishnit.bookstoreapp.entity.Book;

@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {}