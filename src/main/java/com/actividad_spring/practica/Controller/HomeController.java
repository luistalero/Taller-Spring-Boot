package com.actividad_spring.practica.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        
        model.addAttribute("titulo", "BIENVENIDO A EL SISTEMA DE PRODUCTOS");     
        return "index";
    }
}
