package com.artarkatesoft.buildingspringbootwebappsection2.controllers;

import com.artarkatesoft.buildingspringbootwebappsection2.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books_page";
    }
}
