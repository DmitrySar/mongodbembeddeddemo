package com.example.mongodbembedded.repository;

import com.example.mongodbembedded.entity.ComputerCase;
import org.springframework.data.repository.CrudRepository;

public interface ComputerCaseRepository extends CrudRepository<ComputerCase, String> {
}
