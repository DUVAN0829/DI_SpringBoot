package co.duvan.springboot.di.app.spring_boot_di_01.models;

public class Product {

    // *Vars */
    private Long id;
    private String name;
    private long price;

    // *Contructors */
    public Product() {

    }

    public Product(Long id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // *Getters and Setter */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    // *Methods */
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}
