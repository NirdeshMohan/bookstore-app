package com.ishnit.bookstoreapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishnit.bookstoreapp.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
