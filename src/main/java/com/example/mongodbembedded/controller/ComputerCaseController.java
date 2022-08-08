package com.example.mongodbembedded.controller;

import com.example.mongodbembedded.entity.ComputerCase;
import com.example.mongodbembedded.repository.ComputerCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerCaseController {
    @Autowired
    ComputerCaseRepository repository;

    @GetMapping
    public Iterable<ComputerCase> getComputerCases() {
        return repository.findAll();
    }

    @PostMapping
    public void addComputerCase(@RequestBody ComputerCase computerCase) {
        repository.save(computerCase);
    }
}
