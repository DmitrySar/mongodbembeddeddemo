package com.example.mongodbembedded.controller;

import com.example.mongodbembedded.entity.ComputerCase;
import com.example.mongodbembedded.repository.ComputerCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComputerCaseController {
    @Autowired
    ComputerCaseRepository repository;

    @GetMapping
    public Iterable<ComputerCase> getComputerCases() {
        return repository.findAll();
    }

    @PostMapping
    public HttpStatus addComputerCase(@RequestBody ComputerCase computerCase) {
        repository.save(computerCase);
        return HttpStatus.OK;
    }
}
