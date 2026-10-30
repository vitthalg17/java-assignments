package com.vitthal.bookstore;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookstoreApplication {

    @GetMapping("/books")
    public List<String> books() {
        return List.of("Clean Code", "Effective Java", "Head First Java");
    }

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }
}
