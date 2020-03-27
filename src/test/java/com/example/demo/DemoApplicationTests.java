package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


import java.util.List;



@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private AngajatRepository anagajatRepo;

	@Test
	void insertAnagajat(){

		List<Angajat> list1 = anagajatRepo.findAll();

		Angajat a = new Angajat();
		a.setNume("Dorina");
		a.setId(5);
		anagajatRepo.save(a);

		List<Angajat> list = anagajatRepo.findAll();

		Assert.isTrue(list.size() == list1.size() + 1, "nu s-a facut ins");
	}


}
