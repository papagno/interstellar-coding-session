package com.example.backend;

import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

import com.example.backend.entities.Product;
import com.example.backend.repositories.ProductsRepository;
import jakarta.annotation.PostConstruct;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    @Autowired private ProductsRepository productsRepository;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @PostConstruct
    void init() {
        val random = new Random();

        IntStream
                .range(0, 100)
                .forEach(i -> {
                    val product = new Product();
                    product.setId(UUID.randomUUID());
                    product.setName("Product " + i);
                    product.setPrice(10 + random.nextFloat() * 900);

                    productsRepository.save(product);
                });
    }

}
