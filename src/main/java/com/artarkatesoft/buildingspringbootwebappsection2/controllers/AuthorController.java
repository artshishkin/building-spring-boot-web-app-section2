package com.artarkatesoft.buildingspringbootwebappsection2.controllers;

import com.artarkatesoft.buildingspringbootwebappsection2.domain.Author;
import com.artarkatesoft.buildingspringbootwebappsection2.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @GetMapping("authors")
    public String getAllAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "author/list";
    }
}
