package com.saintvandora.innovate.spring_boot_mongodb_tutorial.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.saintvandora.innovate.spring_boot_mongodb_tutorial.model.Expense;

public interface ExpenseRepository extends MongoRepository<Expense, String>{
    @Query("{'name': ?0}")
    Optional<Expense> findByName(String name);
}