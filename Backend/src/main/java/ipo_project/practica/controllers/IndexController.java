package ipo_project.practica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/productos")
    public String showindex(Model model) {  
        return "productos";
    }   
}
