package com.mohamadnaser.inventorymanagementsystem.models;
import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class CarModels {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String Marke;
    private String Model;
    private String Year;
    private String Color;
    private String Milliage;
    private String Priccee;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMarke() {
        return Marke;
    }

    public void setMarke(String marke) {
        Marke = marke;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMilliage() {
        return Milliage;
    }

    public void setMilliage(String milliage) {
        Milliage = milliage;
    }

    public String getPriccee() {
        return Priccee;
    }

    public void setPriccee(String priccee) {
        Priccee = priccee;
    }
}
