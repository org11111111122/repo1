package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired

    private AngajatRepository userRepository;
    @Autowired

    private BugRepository bugRepository;
    @Autowired

    private ProiectRepository proiectRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {

        Angajat n = new  Angajat();
        n.setNume(name);

        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable< Angajat> getAllUsers() {
        List<Angajat> list = userRepository.findAll();
        System.out.println(list);

        return list;
    }

    @GetMapping(path="/allbugs")
    public @ResponseBody Iterable<Bug> getAllBugs() {
        return bugRepository.findAll();
    }

    @GetMapping(path="/allproj")
    public @ResponseBody Iterable<Proiect> getAllProj() {
        return proiectRepository.findAll();
    }
}