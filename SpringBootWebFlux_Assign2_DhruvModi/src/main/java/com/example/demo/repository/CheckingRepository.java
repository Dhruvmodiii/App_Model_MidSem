package com.example.demo.repository;

import com.example.demo.model.Checking;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CheckingRepository extends ReactiveMongoRepository<Checking,String> { 

}