package co.duvan.springboot.di.app.spring_boot_di_01.repositories;

import java.util.Arrays;
import java.util.List;

import co.duvan.springboot.di.app.spring_boot_di_01.models.Product;

public class ProductRepositoryImpl implements ProductRepository {

    // *Vars */
    private List<Product> data;

    // *Constructors */
    public ProductRepositoryImpl() {

        this.data = Arrays.asList(
                new Product(1L, "Apple", 30L),
                new Product(2L, "Pineapple", 20L),
                new Product(3L, "Watermelon", 15L),
                new Product(4L, "Banana", 10L));

    }

    // *Methods */
    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}
