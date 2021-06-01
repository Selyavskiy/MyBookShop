package com.example.MyBookShopApp.data.book.repo;

import com.example.MyBookShopApp.data.book.BookToUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookToUserRepository extends JpaRepository<BookToUser, Integer> {
}
