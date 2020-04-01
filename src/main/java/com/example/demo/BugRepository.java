package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BugRepository extends CrudRepository<Bug, Integer> {
    List<Bug> findAll();
    List<Bug> findByDescriere(String descriere);
}
