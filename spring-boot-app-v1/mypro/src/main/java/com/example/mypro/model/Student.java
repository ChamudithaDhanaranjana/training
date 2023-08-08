package com.example.mypro.model;

import java.util.Date;

public class Student {
    private Long id;
    private String name;
    private Date dateOfBirth;
    private double average;

    public Student(Long id, String name, Date dateOfBirth, double average) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.average = average;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}

