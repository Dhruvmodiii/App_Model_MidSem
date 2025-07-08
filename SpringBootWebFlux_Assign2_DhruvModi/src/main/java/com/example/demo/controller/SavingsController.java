package com.example.demo.controller;

import com.example.demo.model.Savings;
import com.example.demo.service.SavingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/savings")
public class SavingsController {

    @Autowired
    private SavingsService service;

    @PostMapping
    public Mono<Savings> create(@RequestBody Savings savings) {
        return service.save(savings);
    }

    @GetMapping
    public Flux<Savings> getAll() {
        return service.getAll();
    }
}