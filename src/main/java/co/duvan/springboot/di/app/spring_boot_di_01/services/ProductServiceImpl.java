package co.duvan.springboot.di.app.spring_boot_di_01.services;

import java.util.List;
import java.util.stream.Collectors;

import co.duvan.springboot.di.app.spring_boot_di_01.models.Product;
import co.duvan.springboot.di.app.spring_boot_di_01.repositories.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductServices {

    // *Vars */
    private ProductRepositoryImpl repository = new ProductRepositoryImpl();

    // *Methods */
    @Override
    public List<Product> findAll() {

        return repository.findAll().stream().map(p -> {

            Double priceTax = p.getPrice() * 2.5d;
            // Product product = new Product(p.getId(), p.getName(), priceTax.longValue());
            Product product = (Product) p.clone();
            product.setPrice(priceTax.longValue());
            return product;

        }).collect(Collectors.toList());

    }

    @Override
    public Product findById(Long id) {
        return repository.findById(id);
    }

}
