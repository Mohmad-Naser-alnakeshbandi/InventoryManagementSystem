package com.mohamadnaser.inventorymanagementsystem.services;

import com.mohamadnaser.inventorymanagementsystem.models.CarModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarModels, Integer> {
}
