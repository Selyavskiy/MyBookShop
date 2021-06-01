package com.example.MyBookShopApp.data.book.repo;

import com.example.MyBookShopApp.data.book.BookReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewRepository extends JpaRepository<BookReview, Integer> {
}
