package com.travels.travels.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class USAToursController {

    @GetMapping("/usa/add")
    public String blogAdd(Model model) {
        return "usatours";
    }
}
