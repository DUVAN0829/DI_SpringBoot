package co.duvan.springboot.di.app.spring_boot_di_01.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.duvan.springboot.di.app.spring_boot_di_01.models.Product;
import co.duvan.springboot.di.app.spring_boot_di_01.services.ProductServices;

@RestController
@RequestMapping("/api")
public class SomeController {
    
    //*Vars */
    private ProductServices service;

    //*Constructor */
    public SomeController(ProductServices service) {
        this.service = service;
    }

    //*Methods */
    @GetMapping
    public List<Product> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return service.findById(id);
    }

}
