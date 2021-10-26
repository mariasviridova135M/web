package com.sviridova.web_labrab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LabRab1Controller {
    @GetMapping("/lab_rab1")
    public String labrab1(Model model) {
        model.addAttribute("title", "Работа 1");
        return "lab_rab1";
    }
}
