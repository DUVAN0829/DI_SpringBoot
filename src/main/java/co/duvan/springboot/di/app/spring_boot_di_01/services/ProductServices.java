package co.duvan.springboot.di.app.spring_boot_di_01.services;

import java.util.List;

import co.duvan.springboot.di.app.spring_boot_di_01.models.Product;

public interface ProductServices {
    
    List<Product> findAll();
    Product findById(Long id);

}
