package com.actividad_spring.practica.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.actividad_spring.practica.Models.entities.Product;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();
    
    public ProductRepository() {
        product();
    }

    private void product() {
        products.addAll(List.of(
            new Product(1L, "Arroz", "Alimentos", 2500.0, 20),
            new Product(2L, "Agua", "Bebidas",2000.0, 10),
            new Product(3L, "Jabón", "Aseo",1500.0, 80),
            new Product(4L, "Frijoles", "Alimentos",2800.0, 50),
            new Product(5L, "Limpiavidrios", "Limpieza",5000.0, 5),
            new Product(6L, "Toallas sanitarias", "Higiene", 4000.0, 0),
            new Product(7L, "Jugo de naranja", "Bebidas", 3500.0, 15),
            new Product(8L, "Pasta dental", "Aseo", 2900.0, 30),
            new Product(9L, "Carne", "Alimentos", 17000.0, 4),
            new Product(10L, "Pañales", "Higiene", 25000.0, 2),
            new Product(11L, "Café", "Bebidas", 1000.0, 50),
            new Product(12L, "Bolsa de basura", "Higiene", 2000.0, 25),
            new Product(13L, "Limpiador de baño", "Limpieza", 6000.0, 40),
            new Product(14L, "Pan", "Alimentos", 4000.0, 44),
            new Product(15L, "Gaseosa", "Bebidas", 2500.0, 33),
            new Product(16L, "Té", "Bebidas", 3000.0, 66),
            new Product(17L, "Leche", "Bebidas", 3500.0, 22),
            new Product(18L, "Desinfectante para pisos", "Limpieza", 4500.0, 11),
            new Product(19L, "Champú", "Aseo", 15000.0, 8),
            new Product( 20L, "Huevos", "Alimentos", 17000.0, 10)
        ));
    }
    
    public List<Product> findAll() { return products; }
}
