package com.example.MyBookShopApp.data.support.repo;

import com.example.MyBookShopApp.data.support.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Integer> {
}
