package com.example.demo.controller;

import com.example.demo.model.Checking;
import com.example.demo.service.CheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/checking")
public class CheckingController {

    @Autowired
    private CheckingService service;

    @PostMapping
    public Mono<Checking> create(@RequestBody Checking checking) {
        return service.save(checking);
    }

    @GetMapping
    public Flux<Checking> getAll() {
        return service.getAll();
    }
}