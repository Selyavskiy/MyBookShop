package com.example.MyBookShopApp.data.support.repo;

import com.example.MyBookShopApp.data.support.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
