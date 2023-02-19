package com.travels.travels.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RussiaToursController {

    @GetMapping("/russia")
    public String russiaTours(Model model) {
        return "russiatours";
    }
}
