package com.example.MyBookShopApp.data.support.repo;

import com.example.MyBookShopApp.data.support.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
