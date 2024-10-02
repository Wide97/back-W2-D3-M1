package ESERCIZIO4;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private Long id;
    private LocalDate orderDate;
    private List<Product> products;
    private Customer customer;

    public Order(Long id, LocalDate orderDate, List<Product> products, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.products = products;
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }
}
