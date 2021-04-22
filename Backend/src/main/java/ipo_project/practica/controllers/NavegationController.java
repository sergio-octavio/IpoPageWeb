package ipo_project.practica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavegationController {

    @GetMapping("/")
    public String showIndex(Model model){
        return "index";
    }

    @GetMapping("/ajustes")
    public String showAjustes(Model model){
        return "ajustes";
    }
}
