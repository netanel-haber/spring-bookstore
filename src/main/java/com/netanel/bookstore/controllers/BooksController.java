package com.netanel.bookstore.controllers;

import com.netanel.bookstore.Repositories.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/books")
public class BooksController {
    @Autowired
    private BookRepo bookRepo;

    @GetMapping
    public String books(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "books.html";
    }
}