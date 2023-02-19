package com.travels.travels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Добро пожаловать!");
        return "home";
    }

    @GetMapping("/cabinet")
    public String cabinet(Model model) {
        model.addAttribute("title", "Страница кабинета");
        return "cabinet";
    }
}
