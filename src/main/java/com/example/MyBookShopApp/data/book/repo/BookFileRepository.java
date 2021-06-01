package com.example.MyBookShopApp.data.book.repo;

import com.example.MyBookShopApp.data.book.BookFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookFileRepository extends JpaRepository<BookFile, Integer> {
}
