package com.example.codeengine.express.repository;

import com.example.codeengine.express.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
