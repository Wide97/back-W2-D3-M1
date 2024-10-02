package ESERCIZIO2;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class ESERCIZIO2 {
    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order(1L, "delivered", LocalDate.of(2023, 9, 10), LocalDate.of(2023, 9, 15),
                        List.of(new Product(1L, "Toy 1", "Toys", 25.0), new Product(2L, "Baby Lotion", "Baby", 15.0)),
                        new Customer(1L, "Anna", 2)),
                new Order(2L, "shipped", LocalDate.of(2023, 9, 12), LocalDate.of(2023, 9, 20),
                        List.of(new Product(3L, "Shampoo", "Beauty", 30.0), new Product(4L, "Baby Soap", "Baby", 12.0)),
                        new Customer(2L, "Marco", 1)),
                new Order(3L, "processing", LocalDate.of(2023, 9, 20), LocalDate.of(2023, 9, 25),
                        List.of(new Product(5L, "Phone", "Electronics", 250.0), new Product(6L, "Laptop", "Electronics", 1000.0)),
                        new Customer(3L, "Luigi", 3))
        );

        List<Order> babyProductOrders = orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Baby")))
                .collect(Collectors.toList());

        babyProductOrders.forEach(System.out::println);

    }
}
