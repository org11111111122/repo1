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
	@Autowired
	private BugRepository bugRepo;

	@Autowired
	private HateThreadRepository hateThreadRepository;
	@Autowired
	private ProiectRepository proiectRepository;

	@Test
	void insertAnagajat(){

		List<Angajat> list1 = anagajatRepo.findAll();

		Angajat a = new Angajat();
		a.setNume("Dorina7");
		a.setId(7);
		anagajatRepo.save(a);

		List<Angajat> list = anagajatRepo.findAll();
		Assert.isTrue(list.size() == list1.size() + 1, "nu s-a facut ins");


		anagajatRepo.delete(a);

	}

	@Test
	void insertAngajat2(){
		List<Angajat> list1 = anagajatRepo.findAll();

		Angajat a = new Angajat();
		a.setNume("Dorina 123");
		anagajatRepo.save(a);
		List<Angajat> found = anagajatRepo.findByNume("Dorina 123");
		System.out.println(found.get(0).getNume());
		Assert.isTrue(found.get(0).getNume().equals("Dorina 123"), "nu s-a facut corect inserarea");
		anagajatRepo.delete(found.get(0));

	}

	@Test
	void insertBug(){
		Bug a = new Bug();
		a.setDescriere("desc1");
		a.setId(7);
		bugRepo.save(a);
		List<Bug> found = bugRepo.findByDescriere("desc1");
		Assert.isTrue(found.get(0).getDescriere().equals("desc1"), "nu s-a facut corect inserarea");
		bugRepo.delete(a);

	}

	@Test
	void insertBug2(){
		List<Bug> list1 = bugRepo.findAll();

		Bug a = new Bug();
		a.setDescriere("desc1");
		a.setId(7);
		bugRepo.save(a);

		List<Bug> list = bugRepo.findAll();

		Assert.isTrue(list.size() == list1.size() + 1, "nu s-a facut ins");
		bugRepo.delete(a);

	}

	@Test
	void insertHateThread(){
		HateThread a = new HateThread();
		a.setText("th1");
		Angajat ang = new Angajat();
		ang.setNume("nume123");
		a.setAngajat(ang);

		hateThreadRepository.save(a);
		ang = anagajatRepo.findByNume("nume123").get(0);
		List<HateThread> found = hateThreadRepository.findByAngajat(ang);
		System.out.println(found);
		Assert.isTrue(found.get(0).getAngajat().getNume().equals(ang.getNume()), "nu s-a facut corect inserarea");
        hateThreadRepository.delete(a);
        anagajatRepo.delete(ang);



	}


}
