package com.mohamadnaser.inventorymanagementsystem.controller;

import com.mohamadnaser.inventorymanagementsystem.models.CarModels;
import com.mohamadnaser.inventorymanagementsystem.services.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping({"","/"})
    public String showCarList(Model model){
        List<CarModels> carModelsList = carRepository.findAll();
        model.addAttribute("cars", carModelsList);
        return "cars/index";
    }
}
