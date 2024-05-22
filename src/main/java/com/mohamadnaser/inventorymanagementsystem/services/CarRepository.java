package com.mohamadnaser.inventorymanagementsystem.services;

import com.mohamadnaser.inventorymanagementsystem.models.CarModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<CarModels, Integer> {
    List<CarModels> findByMarke(String marke);
}
