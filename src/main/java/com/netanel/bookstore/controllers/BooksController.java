package com.netanel.bookstore.controllers;

import com.netanel.bookstore.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/books")
public class BooksController {
    @Autowired
    private BookRepo bookRepo;

    @GetMapping(value = "/delete/{id}")
    public String deleteBookById(@PathVariable("id") Long id, RedirectAttributes redAttr) {
        System.out.println("here");
        bookRepo.deleteById(id);
        redAttr.addFlashAttribute("deleteBookMessage", String.format("book #%s was deleted.", id));
        return "redirect:/books";
    }

    @GetMapping
    public String books(Model model) {
        System.out.println("here");
        model.addAttribute("books", bookRepo.findAll());
        return "books.html";
    }
}