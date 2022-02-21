package com.example.corona.controller;

import com.example.corona.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    DataService dataService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("locationStats", dataService.getAllStats());
        return "home";
    }
}
