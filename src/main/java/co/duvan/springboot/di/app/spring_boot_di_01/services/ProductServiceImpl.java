package co.duvan.springboot.di.app.spring_boot_di_01.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import co.duvan.springboot.di.app.spring_boot_di_01.models.Product;
import co.duvan.springboot.di.app.spring_boot_di_01.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductServices {

    // *Vars */
    // @Autowired
    // @Qualifier("productRepositoryImpl")
    private ProductRepository repository;
    @Autowired
    private Environment enviroment;

    //*Constructor */
    public ProductServiceImpl(@Qualifier("productFoo") ProductRepository repository) {
        this.repository = repository;
    }

    // *Methods */
    @Override
    public List<Product> findAll() {

        return repository.findAll().stream().map(p -> {

            Double priceTax = p.getPrice() * enviroment.getProperty("config.price.tax", Double.class);
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
