package com.example.ecommerce.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book , Long> {
    List<Book> findByNameContainingIgnoreCase(String keyword);
}
