package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HateThreadRepository extends CrudRepository<HateThread, Integer> {
    List<HateThread> findAll();
    List<HateThread> findByAngajat(Angajat a);
}
