package com.example.MyBookShopApp.data.book.repo;

import com.example.MyBookShopApp.data.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
