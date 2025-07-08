package com.example.demo.service;

import com.example.demo.model.Savings;
import com.example.demo.repository.SavingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class SavingsService {

    @Autowired
    private SavingsRepository savingsRepository;

    public Mono<Savings> save(Savings savings) {
        return savingsRepository.save(savings);
    }

    public Flux<Savings> getAll() {
        return savingsRepository.findAll();
    }
}