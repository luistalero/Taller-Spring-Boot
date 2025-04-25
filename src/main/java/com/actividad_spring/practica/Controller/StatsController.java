package com.actividad_spring.practica.Controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.actividad_spring.practica.Models.entities.Product;
import com.actividad_spring.practica.Models.entities.Static;
import com.actividad_spring.practica.Repository.ProductRepository;

@Controller
@RequestMapping("/api")
public class StatsController {

    private final ProductRepository repo;
    public ProductController(ProductRepository repo) { this.repo = repo; }

    @GetMapping("/products/stats")
    public Map<String, Double> getStats(
        @RequestParam(required = false) String category
    ) {
    
        List<Product> listadoFiltrado = repo.findAll().stream()
        .filter(p -> category == null || p.getCategory().equalsIgnoreCase(category))
        .collect(Collectors.toList());

        return Map.of(
            "count", (double) listadoFiltrado.getCount(),
            "avgPrice", listadoFiltrado.getAverage(),
            "minPrice", listadoFiltrado.getMin(),
            "maxPrice", listadoFiltrado.getMax(),
            "totalValue", listadoFiltrado.getSum()
        );
    }
}
