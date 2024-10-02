package ESERCIZIO2;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", status='" + status + "', orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", products=" + products + ", customer=" + customer + "}";
    }
}
