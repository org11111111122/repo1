    package com.example.demo;


    import org.springframework.data.repository.CrudRepository;

    import java.util.List;


    // This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
    // CRUD refers Create, Read, Update, Delete

    public interface AngajatRepository extends CrudRepository<Angajat, Integer> {
        List<Angajat> findAll();
        List<Angajat> findByNume(String name);


    }

