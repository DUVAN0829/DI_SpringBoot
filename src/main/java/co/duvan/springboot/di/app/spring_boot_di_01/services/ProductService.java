package co.duvan.springboot.di.app.spring_boot_di_01.services;

import java.util.List;
import java.util.stream.Collectors;

import co.duvan.springboot.di.app.spring_boot_di_01.models.Product;
import co.duvan.springboot.di.app.spring_boot_di_01.repositories.ProductRepository;

public class ProductService {

    // *Vars */
    private ProductRepository repository = new ProductRepository();

    // *Methods */
    public List<Product> findAll() {

        return repository.findAll().stream().map(p -> {

            Double priceImp = p.getPrice() * 2.5d;
            Product product = new Product(p.getId(), p.getName(), priceImp.longValue());
            return product;
            
        }).collect(Collectors.toList());

    }

    public Product findById(Long id) {
        return repository.findById(id);
    }

}
