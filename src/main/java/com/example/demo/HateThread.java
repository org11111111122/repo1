package com.example.demo;

import javax.persistence.*;

@Entity
public class HateThread {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;


    private String text;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Angajat angajat;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Angajat getAngajat() {
        return angajat;
    }

    public void setAngajat(Angajat angajat) {
        this.angajat = angajat;
    }
}
