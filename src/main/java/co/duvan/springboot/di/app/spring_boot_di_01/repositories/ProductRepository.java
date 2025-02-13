package co.duvan.springboot.di.app.spring_boot_di_01.repositories;

import java.util.List;

import co.duvan.springboot.di.app.spring_boot_di_01.models.Product;

public interface ProductRepository {
    
    List<Product> findAll();
    Product findById(Long id);

}
