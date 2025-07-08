package com.example.demo.repository;

import com.example.demo.model.Savings;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SavingsRepository extends ReactiveMongoRepository<Savings, String> {}