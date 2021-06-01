package com.example.MyBookShopApp.data.support.repo;

import com.example.MyBookShopApp.data.support.BalanceTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceTransactionRepository extends JpaRepository<BalanceTransaction, Integer> {
}
