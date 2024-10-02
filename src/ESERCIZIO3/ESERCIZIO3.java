package ESERCIZIO3;

import java.util.List;
import java.util.stream.Collectors;

public class ESERCIZIO3 {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product(1L, "Toy Car", "Boys", 20.0),
                new Product(2L, "Baby Lotion", "Baby", 15.0),
                new Product(3L, "Action Figure", "Boys", 30.0),
                new Product(4L, "Doll", "Girls", 25.0)
        );

        List<Product> discountedBoysProducts = products.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .map(product -> new Product(
                        product.getId(),
                        product.getName(),
                        product.getCategory(),
                        product.getPrice() * 0.9
                )).collect(Collectors.toList());

        discountedBoysProducts.forEach(System.out::println);


    }
}
