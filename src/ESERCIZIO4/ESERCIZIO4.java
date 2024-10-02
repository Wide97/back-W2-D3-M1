package ESERCIZIO4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ESERCIZIO4 {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1L, LocalDate.of(2023, 9, 10),
                List.of(new Product(1L, "Toy 1", "Toys", 25.0),
                        new Product(2L, "Book 1", "Books", 15.0)),
                new Customer(1L, "Anna", 2)));

        orders.add(new Order(2L, LocalDate.of(2023, 9, 12),
                List.of(new Product(3L, "Toy 2", "Toys", 30.0)),
                new Customer(2L, "Marco", 1)));

        orders.add(new Order(3L, LocalDate.of(2023, 9, 15),
                List.of(new Product(4L, "Book 2", "Books", 20.0),
                        new Product(5L, "Toy 3", "Toys", 40.0)),
                new Customer(3L, "Luisa", 2)));

        LocalDate startDate = LocalDate.of(2023, 9, 1);
        LocalDate endDate = LocalDate.of(2023, 9, 30);

        List<Product> tier2Products = orders.stream()
                .filter(order -> order.getCustomer().getTier() == 2)
                .filter(order -> !order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toList());

        tier2Products.forEach(System.out::println);
    }
}
