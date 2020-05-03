package com.netanel.bookstore.controllers;

import com.netanel.bookstore.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private BookRepo bookRepo;

    @GetMapping(value = "books/delete/{id}")
    public String deleteBookById(@PathVariable("id") Long id, RedirectAttributes redAttr) {
        bookRepo.deleteById(id);
        redAttr.addFlashAttribute("deleteBookMessage", String.format("book #%s was deleted.", id));
        return "redirect:/books";
    }

    @GetMapping(value = "books/edit/{id}")
    public String editBookById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookRepo.findById(id).get());
        model.addAttribute("action", "Edit");
        return "book.html";
    }

}