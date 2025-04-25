package com.actividad_spring.practica.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.actividad_spring.practica.Models.entities.Product;
import com.actividad_spring.practica.Repository.ProductRepository;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/api")
public class ProductController {

    private final ProductRepository repo;
    public ProductController(ProductRepository repo) { this.repo = repo; }

    @GetMapping("/products")
    public String getProducts(
        @RequestParam(required = false) Double minPrice,
        @RequestParam(required = false) Double maxPrice,
        @RequestParam(required = false) String category,
        Model model
        ) {
            List<Product> listadoFiltrado = repo.findAll().stream()
            .filter(p -> minPrice == null || p.getPrice() >= minPrice)
            .filter(p -> maxPrice == null || p.getPrice() <= maxPrice)
            .filter(p -> category == null || category.isEmpty() || p.getCategory().equalsIgnoreCase(category))
            .collect(Collectors.toList());
        model.addAttribute("products", listadoFiltrado);
        model.addAttribute("titleFiltro", "Bienvenido a la sección de Filtrado");
        
        DoubleSummaryStatistics stats = listadoFiltrado.stream()
            .collect(Collectors.summarizingDouble(Product::getPrice));

        model.addAttribute("count", stats.getCount());
        model.addAttribute("avgPrice", stats.getAverage());
        model.addAttribute("minPrice", stats.getMin());
        model.addAttribute("maxPrice", stats.getMax());
        model.addAttribute("totalValue", stats.getSum());
        
        return "filter";
    }
}
