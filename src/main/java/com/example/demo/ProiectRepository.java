package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProiectRepository extends CrudRepository<Proiect, Integer> {
    List<Proiect> findAll();
    //List<Proiect> findByNume(String nume);

}

