package com.mohamadnaser.inventorymanagementsystem.controller;

import com.mohamadnaser.inventorymanagementsystem.models.CarModels;
import com.mohamadnaser.inventorymanagementsystem.services.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping({"", "/"})
    public String showCarList(Model model) {
        List<CarModels> carModelsList = carRepository.findAll();
        model.addAttribute("cars", carModelsList);
        return "cars/index";
    }

    @GetMapping("/Benz")
    public String showCarListOfBenz(Model model) {
        List<CarModels> carModelsList = carRepository.findByMarke("Mercedes-Benz");
        model.addAttribute("cars", carModelsList);
        return "cars/index";
    }

    @GetMapping("/BMW")
    public String showCarListOfBMW(Model model) {
        List<CarModels> carModelsList = carRepository.findByMarke("BMW");
        model.addAttribute("cars", carModelsList);
        return "cars/index";
    }

    @GetMapping("/VW")
    public String showCarListOfVW(Model model) {
        List<CarModels> carModelsList = carRepository.findByMarke("Volkswagen");
        model.addAttribute("cars", carModelsList);
        return "cars/index";
    }

    @GetMapping("/Audi")
    public String showCarListOfAudi(Model model) {
        List<CarModels> carModelsList = carRepository.findByMarke("Audi");
        model.addAttribute("cars", carModelsList);
        return "cars/index";
    }

    @GetMapping("/add")
    public String showFromForNewCar() {
        return "cars/addCar";
    }

    @PostMapping("/add")
    public String addNewCar(@ModelAttribute CarModels car) {
        carRepository.save(car);
        return "redirect:/cars";
    }

}
