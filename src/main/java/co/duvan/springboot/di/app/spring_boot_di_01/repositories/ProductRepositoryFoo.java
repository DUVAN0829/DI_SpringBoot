package co.duvan.springboot.di.app.spring_boot_di_01.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import co.duvan.springboot.di.app.spring_boot_di_01.models.Product;


@Primary
@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository {
    
    @Override
    public List<Product> findAll() {
        return Arrays.asList(new Product(1L, "Mango", 20L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id, "Mango", 20L);
    }
    
}
