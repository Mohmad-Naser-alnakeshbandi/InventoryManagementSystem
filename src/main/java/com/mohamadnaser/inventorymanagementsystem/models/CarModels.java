package com.mohamadnaser.inventorymanagementsystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class CarModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marke;
    private String model;
    private String year;
    private String color;
    private String milliage;
    private String priccee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMilliage() {
        return milliage;
    }

    public void setMilliage(String milliage) {
        this.milliage = milliage;
    }

    public String getPriccee() {
        return priccee;
    }

    public void setPriccee(String priccee) {
        this.priccee = priccee;
    }
}
