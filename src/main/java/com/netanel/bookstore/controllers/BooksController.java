package com.netanel.bookstore.controllers;

import com.netanel.bookstore.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/books")
public class BooksController {
    @Autowired
    private BookRepo bookRepo;

    @DeleteMapping(value = "/{id}/delete")
    public String deleteBookById(Model model, @PathVariable("id") Long id) {
        bookRepo.deleteById(id);
        model.addAttribute("books", bookRepo.findAll());
        return "books.html";
    }

    @GetMapping
    public String books(Model model) {
        System.out.println("here");
        model.addAttribute("books", bookRepo.findAll());
        return "books.html";
    }
}