package com.actividad_spring.practica.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/home")
    public String index(Model model) {
        
        model.addAttribute("titulo", "BIENVENIDO A EL SISTEMA DE PRODUCTOS");     
        return "index";
    }
}
