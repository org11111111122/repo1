package com.example.demo;

import javax.persistence.*;

@Entity
public class Bug {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Proiect proiect;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Angajat angajat;

    private String descriere;
    private String screenshot;


    private Integer status;
    private Integer prority;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private HateThread hateThread;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String nume) {
        this.screenshot = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPrority() {
        return prority;
    }

    public void setPrority(Integer prority) {
        this.prority = prority;
    }

    public Angajat getAngajat() {
        return angajat;
    }

    public void setAngajat(Angajat angajat) {
        this.angajat = angajat;
    }

    public Proiect getProiect() {
        return proiect;
    }

    public void setProiect(Proiect proiect) {
        this.proiect = proiect;
    }

    public HateThread getHateThread() {
        return hateThread;
    }

    public void setHateThread(HateThread hateThread) {
        this.hateThread = hateThread;
    }
}