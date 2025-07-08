package com.example.demo.service;

import com.example.demo.model.Checking;
import com.example.demo.repository.CheckingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class CheckingService {

    @Autowired
    private CheckingRepository checkingRepository;

    public Mono<Checking> save(Checking checking) {
        return checkingRepository.save(checking);
    }

    public Flux<Checking> getAll() {
        return checkingRepository.findAll();
    }
}