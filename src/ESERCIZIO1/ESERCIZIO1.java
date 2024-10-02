package ESERCIZIO1;

import java.util.List;
import java.util.stream.Collectors;

public class ESERCIZIO1 {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1L, "Book 1", "Books", 120.0),
                new Product(2L, "Book 2", "Books", 90.0),
                new Product(3L, "Pen", "Stationery", 5.0),
                new Product(4L, "Book 3", "Books", 150.0),
                new Product(5L, "Notebook", "Stationery", 15.0)
        );

        List<Product> expensiveBooks = products.stream()
                .filter(p -> p.getCategory().equals("Books"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());

        expensiveBooks.forEach(System.out::println);

    }
}