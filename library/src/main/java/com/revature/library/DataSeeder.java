package com.revature.library;

import com.revature.library.model.Book;
import com.revature.library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner initDatabase(BookRepository bookRepository) {
        return args -> {
            if (bookRepository.count() == 0) {
                bookRepository.save(new Book("Clean Code", "Robert Martin", "978-0132350884"));
                bookRepository.save(new Book("The Pragmatic Programmer", "David Thomas", "978-0135957059"));
                bookRepository.save(new Book("Design Patterns", "Gang of Four", "978-0201633610"));
                bookRepository.save(new Book("Effective Java", "Joshua Bloch", "978-0134685991"));
                bookRepository.save(new Book("Spring in Action", "Craig Walls", "978-1617297571"));
                
                System.out.println("Database seeded with 5 books.");
            } else {
                System.out.println("Database already contains books. Skipping seed.");
            }
        };
    }
}
