package com.netanel.bookstore.controllers;

import javax.validation.Valid;

import com.netanel.bookstore.Book;
import com.netanel.bookstore.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping(value = "books/add")
    public String addBookBy(Model model) {
        model.addAttribute("action", "add");
        return "book.html";
    }

    @PostMapping(value = "books/add")
    public String addBookBy(@ModelAttribute Book book) {
        bookRepo.save(book);
        return "redirect:/books";
    }


    @GetMapping(value = "books/edit/{id}")
    public String getEditBookById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookRepo.findById(id).get());
        model.addAttribute("action", "edit");
        return "book.html";
    }

    @PostMapping(value = "books/edit/{id}")
    public String editBookById(@ModelAttribute Book book) {
        bookRepo.save(book);
        return "redirect:/books";
    }

}