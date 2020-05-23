package com.mutyala.jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mutyala.jpa.book.Address;
import com.mutyala.jpa.book.Library;
import com.mutyala.jpa.book.LibraryRepository;

@RequiredArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {
    private final LibraryRepository libraryRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        // Create a couple of Library and Address
        libraryRepository.save(new Library("Library 1", new Address("Street 1", "Zip 1")));
        libraryRepository.save(new Library("Library 2", new Address("Street 2", "Zip 2")));
    }
}
